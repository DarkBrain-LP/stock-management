/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;

/**
 *
 * @author FIOKLOU
 */
public class Article extends JButton {
    static final String DB_URL="jdbc:mysql://localhost/gestionstock";
    static final String DB_DRV="com.mysql.jdbc.Driver";
    static final String DB_User="root";
    static final String DB_Password="";
    Statement stat;
    PreparedStatement ps;
    Connection connect;
    ResultSet resultat;
    
    
}
