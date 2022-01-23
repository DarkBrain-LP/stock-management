 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dab;

import entity.Article;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M@nU_LP
 */
public class ArticleDaoImpl implements ArticleDao {
    String connector = "jdbc:";
    String sgbd = "mysql:";
    String adresse = "//localhost/";
    String bd = "gestion_stock";
    String user = "root";
    String password = "";
    
    Connection con;
    PreparedStatement pst;
    ResultSet rset;
    

    @Override
    public boolean createArticle(Article article) {
        boolean done = false;
        
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
            
            pst = con.prepareStatement("INSERT INTO article VALUES(?, ?, ?, ?, ?)");
            // On recupere les valeurs dans le tableau
            List valeurs = article.getElements();
            
            // On remplit les données de la prepareStatement
            for(int i = 0; i < valeurs.size(); i ++){
                pst.setObject(i+1, valeurs.get(i));
            }
            
            pst.executeUpdate();
            done = true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return done;
    }

    @Override
    public Article getArticleById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteArticle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Article updateArticle(Article article) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Article> listArticle() {
        
        ArrayList<Article> liste = new ArrayList<>();
        
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
            
            pst = con.prepareStatement("SELECT * FROM article");
            rset = pst.executeQuery();
            
            while(rset.next()){
                String code = rset.getString("code_article");
                String libel = rset.getString("libel_article");
                double prix = rset.getDouble("prix_article");
                int qte = rset.getInt("quantite_stock");
                Date date = rset.getDate("date_creation_article");
                
                Article art = new Article(code, libel, prix, qte, date);
                liste.add(art);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return liste;
    }
    
}
