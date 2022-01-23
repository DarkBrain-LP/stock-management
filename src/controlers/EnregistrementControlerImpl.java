/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M@nU_LP
 */
public class EnregistrementControlerImpl implements EnregistrementControler {

    private boolean valide = false;
    
    @Override
    public boolean controlCodeArticle(String code) {
        valide = true;
        
        if((code.length() <= 5) && (!code.isEmpty()) ){
            valide = true;
        }
        
        return valide;
    }
    
    public String getCodeArticle(String code){
        if(controlCodeArticle(code)){
            return code;
        }
        
        return "";
    }

    @Override
    public boolean controlLibelArticle(String label) {
        valide = false;
        
        if((label.length() <= 12) && (!label.isEmpty()) ){
            valide = true;
        }
        
        return valide;
    }
    
    public String getLibelArticle(String label){
        if(controlLibelArticle(label)){
            return label;
        }
        
        return "";
    }

    @Override
    public boolean controlPrixArticle(String prix) {
        valide = false;
        
        try{
            Double.parseDouble(prix);
            
            if(!prix.isEmpty() )
                valide = true;
        } catch(NumberFormatException e){
            System.out.println("Impossible de convertir le prix en double");
        }
        
        return valide;
    }
    
    @Override
    public double getPrixArticle(String prix){
        System.out.println("prix = " + prix);
        // Vérifier si le prix peut etre transformé en double
        if(controlPrixArticle(prix)){
            // Convertir le prix en double
            double d = Double.parseDouble(prix);
            // Vérifier si le prix est positif
            if(d > 0)
                return d;
            else
                return -1.0;
        }
        // Si le prix ne peut pas etre converti, retourner -1
        return 0;
    }

    @Override
    public boolean controlQte(String qte) {
        valide = false;
        
        try{
            Integer.parseInt(qte);
            
            if( !qte.isEmpty() )
                valide = true;
        } catch(NumberFormatException e){
            System.out.println("Impossible de convertir la quantité en entier");
        }
        
        return valide;
    }
    
    public int getQte(String qte){
        System.out.println("qte = " + qte);
        // Vérifier si le prix peut etre transformé en double
        if(controlQte(qte)){
            // Convertir le prix en double
            int q = Integer.parseInt(qte);
            // Vérifier si le prix est positif
            if(q > 0)
                return q;
            else
                return -1;
        }
        // Si la quantité ne peut pas etre converti, retourner -1
        return 0;
    }

    @Override
    public boolean controlDateCreation(String date) {
        valide = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        
        try {
            Date dateTraitee = sdf.parse(date);
            if( !date.isEmpty() )
                valide = true;
        } catch (ParseException ex) {
            System.out.println("Erreur, veuillez entrer une date valide svp");
        }
        
        return valide;
    }
    
    public Date getDateCreation(String date) throws ParseException{
        if(controlDateCreation(date))
            return (new SimpleDateFormat("yyyy-mm-dd")).parse(date);
        
        return null;
    }
    
}
