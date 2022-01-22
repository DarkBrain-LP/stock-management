/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.stock;

import dab.ArticleDaoImpl;
import entity.Article;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M@nU_LP
 */
public class GestionStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-mm-dd");
            Date date = sfd.parse("2022-01-22");
            Article art = new Article("Len720", "LENOVO 720", 420000, 1, date);
            System.out.println(new ArticleDaoImpl().createArticle(art));
        } catch (ParseException ex) {
            Logger.getLogger(GestionStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
