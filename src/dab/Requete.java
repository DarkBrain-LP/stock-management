/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import controle.Login;



/**
 *
 * @author FIOKLOU
 */
public class Requete {
    static final String DB_URL="jdbc:mysql://localhost/gestionstock";
    static final String DB_DRV="com.mysql.jdbc.Driver";
    static final String DB_User="root";
    static final String DB_Password="";
    Statement stat;
    PreparedStatement ps;
    Connection connect;
    ResultSet resultat;
    
    
    
    public Connection dbconnect(){
        try {
              connect = DriverManager.getConnection(DB_URL,DB_User,DB_Password);
              
        } catch (SQLException ex) {
            Logger.getLogger(Requete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }

    
    public void loginInsert(Login utilisateur) throws SQLException{
        
        dbconnect();
        
        String query = "INSERT INTO login('userName','password') VALUES(?,?) ";
        ps = connect.prepareStatement(query);
        ps.setString(1 , utilisateur.getUserName());
        ps.setString(2 , utilisateur.getPassword());
        
        
    }
        
    

    
      
            
            
       
            
   
        
    
}
