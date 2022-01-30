/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.stock;

import controlers.EnregistrementControlerImpl;
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
        
        // TODO code application logic here
        /*SimpleDateFormat sfd = new SimpleDateFormat("yyyy-mm-dd");
        Date date = sfd.parse("2022-20-22");
        Article art = new Article("Len720", "LENOVO 720", 420000, 1, date);
        System.out.println(new ArticleDaoImpl().createArticle(art));
        */
        //System.out.println((new EnregistrementControlerImpl()).controlDateCreation("1520"));
        
        //System.out.println(controlQte(""));
        Article arti = new ArticleDaoImpl().getArticleByCode("111");
        System.out.println("art = " + arti.getCodeArticle() + " " + arti.getLibelArticle() + " " + arti.getPrixArticle() + " "
                                + arti.getQuantiteArticle() + " " + arti.getDateCreationArticle());
        for(Article art : new ArticleDaoImpl().rechercher("6", 6)){
            System.out.println("art = " + art.getCodeArticle() + " " + art.getLibelArticle() + " " + art.getPrixArticle() + " "
                                + art.getQuantiteArticle() + " " + art.getDateCreationArticle());
        }
        
    }
        public static boolean controlQte(String qte) {
        boolean valide = false;
        
        try{
            Integer.parseInt(qte);
            
            if( !qte.isEmpty() )
                valide = true;
        } catch(NumberFormatException e){
            System.out.println("Impossible de convertir la quantité en entier");
        }
        
        return valide;
    }
    
}
