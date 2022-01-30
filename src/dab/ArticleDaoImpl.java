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
    public Article getArticleByCode(String code) {
        Article art = new Article();
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
            
            pst = con.prepareStatement("SELECT * FROM article WHERE code_article=?");
            pst.setString(1, code);
            rset = pst.executeQuery();
            
            while(rset.next()){
                String libel = rset.getString("libel_article");
                System.out.println("libel = " + libel);
                double prix = rset.getDouble("prix_article");
                int qte = rset.getInt("quantite_stock");
                Date date = rset.getDate("date_creation_article");
                
                art.setCodeArticle(code);
                art.setLibelArticle(libel);
                art.setPrixArticle(prix);
                art.setQuantiteArticle(qte);
                art.setDateCreationArticle(date);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return art;
    }

    @Override
    public boolean deleteArticle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateArticle(String code, Article nouveau) {
        boolean done = false;
        
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
            
            pst = con.prepareStatement("ALTER TABLE article SET libel_article=?,"
                    + " prix_article=?, quantite_stock=?, date_creation_article=?"
                    + " WHERE code_article=?");
            // 
            pst.setString(1, nouveau.getLibelArticle());
            pst.setDouble(2, nouveau.getPrixArticle());
            pst.setInt(2, nouveau.getQuantiteArticle());
            pst.setDate(4, (java.sql.Date) nouveau.getDateCreationArticle());
            
            pst.executeUpdate();
            done = true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return done;
    }

    @Override
    public List<Article> listArticle() {
        
        ArrayList<Article> liste = new ArrayList<>();
        
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
            
            pst = con.prepareStatement("SELECT * FROM article ORDER BY date_creation_article");
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

    @Override
    public int nombreTotalArticle() {
        int total = 0;
        
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
            
            pst = con.prepareStatement("SELECT COUNT(code_article) FROM article");
            rset = pst.executeQuery();
            
            while(rset.next()){
                total = rset.getInt("COUNT(code_article)");
            }
            
        } catch (SQLException ex) {
            System.out.println("OUPS UNE ERREUR = ");
        }
        
        System.out.println("total = " + total);
        return total;
    }
    
    /** Fonction générique permettant de rechercher un élément dans la table article
    * 
     * @param <T>
     * Selon le type de <T>, on cherchera dans les colonnes de la table du même type que <T>
     * @param element
     * @return resultat
     * 
    */
    /*
    public <T> ArrayList<Article> rechercher(T element){
        // getClass().getSimpleName() pour connaitre le type de l'objet
        ArrayList<Article> resultat = new ArrayList<>();
        
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
            
            String condition = null;
            
            /**
             * SELECT *
                FROM article
                WHERE CAST(quantite_stock AS NCHAR) LIKE '%4%'
            * Renvoie les ligne de la table où la quantité en stock contient 4
            * C'est cette logique qu'on utilisera au cas où <T> sera un Integer ou un Double
             */
            
    /*        switch(element.getClass().getSimpleName()){
                case "Integer" :
                    condition = "CAST(quantite_stock AS NCHAR) LIKE '%" + element + "%'";
                    System.out.println( "Je suis un Integer element = " + element);
                    break;
                
                case "Double" :
                    condition = "CAST(prix_article AS NCHAR) LIKE '%" + Integer.valueOf((String) element) + "%'";
                    System.out.println( "Je suis un Double element = " + element);
                    break;
                    
                case "Date":
                    condition = "CAST(date_creation_article AS NCHAR) LIKE '%" + Integer.valueOf((String) element) + "%'";
                    System.out.println( "Je suis un Date element = " + element);
                    break;
                    
                case "String":
                    condition = "code_article LIKE('%" + element + "%')"
                            + "OR libel_article LIKE('%" + element + "%')";
                    System.out.println( "Je suis un String element = " + element);
                    break;
                    
                default:
                    break;
            }
            
            String requete = "SELECT * FROM article WHERE " + condition;
            System.out.println("requete = " + requete);
            pst = con.prepareStatement(requete);
            rset = pst.executeQuery();
            
            while(rset.next()){
                String code = rset.getString("code_article");
                String libel = rset.getString("libel_article");
                double prix = rset.getDouble("prix_article");
                int qte = rset.getInt("quantite_stock");
                Date date = rset.getDate("date_creation_article");
                
                Article art = new Article(code, libel, prix, qte, date);
                resultat.add(art);
            }
            
        } catch (SQLException ex) {
            System.out.println("OUPS UNE ERREUR = ");
        }
        
        return resultat;
    }
    */
    /** Fonction prenant en paramètre une chaine de caractere et retournant les lignes
     * de la table article contenant cette chaine. 
    * Il s'agit d'une recherche globale
     * @param element
     * @param cond
     * @return 
    */
    @Override
    public ArrayList<Article> rechercher(String element, int... cond ){
        ArrayList<Article> resultat = new ArrayList<>();
        int i = cond.length > 0?cond[0]:0;
        String condition = "";
        try {
            con = DriverManager.getConnection(connector.concat(sgbd).concat(adresse).concat(bd), 
                    user, password);
        switch(i){
            case 1:
                condition = "CAST(code_article AS NCHAR) LIKE '%" + element + "%'";
                break;
            case 2:
                condition = "CAST(libel_article AS NCHAR) LIKE '%" + element + "%'";
                break;
            case 3:
                condition = "CAST(prix_article AS NCHAR) LIKE '%" + element + "%'";
                break;
            case 4:
                condition = "CAST(quantite_stock AS NCHAR) LIKE '%" + element + "%'";
                break;
            case 5:
                condition = "CAST(date_creation_article AS NCHAR) LIKE '%" + element + "%'";
                break;
            default:
                condition = "CAST(code_article AS NCHAR) LIKE '%" + element + "%'"
                    + " OR CAST(libel_article AS NCHAR) LIKE '%" + element + "%'"
                    + " OR CAST(prix_article AS NCHAR) LIKE '%" + element + "%'"
                    + " OR CAST(quantite_stock AS NCHAR) LIKE '%" + element + "%'"
                    + " OR CAST(date_creation_article AS NCHAR) LIKE '%" + element + "%'";
                break;
        }
    
        /**
        * SELECT *
        FROM article
        WHERE CAST(quantite_stock AS NCHAR) LIKE '%4%'
        * Renvoie les ligne de la table où la quantité en stock contient 4
        * C'est cette logique qu'on utilisera au cas où <T> sera un Integer ou un Double
        */
            
            String requete = "SELECT * FROM article WHERE " + condition;
            System.out.println("requete = " + requete);
            pst = con.prepareStatement(requete);
            rset = pst.executeQuery();
            
            while(rset.next()){
                String code = rset.getString("code_article");
                String libel = rset.getString("libel_article");
                double prix = rset.getDouble("prix_article");
                int qte = rset.getInt("quantite_stock");
                Date date = rset.getDate("date_creation_article");
                
                Article art = new Article(code, libel, prix, qte, date);
                resultat.add(art);
            }
            
        } catch (SQLException ex) {
            System.out.println("OUPS UNE ERREUR = ");
        }
        
        return resultat;
    }
    
}
