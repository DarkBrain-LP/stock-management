/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author M@nU_LP
 */
public class Article {
    private String codeArticle;
    private String libelArticle;
    private double prixArticle;
    private int quantiteArticle;
    private Date dateCreationArticle;
    
    public Article(){}
    
    public Article(String codeArticle, String libelArticle, double prixArticle, int quantiteArticle, Date dateCreationArticle) {
        this.codeArticle = codeArticle;
        this.libelArticle = libelArticle;
        this.prixArticle = prixArticle;
        this.quantiteArticle = quantiteArticle;
        this.dateCreationArticle = dateCreationArticle;
    }
    
    // Recupère les attributs dans un tableau, sauf le codeArticle
    public List getElements(){
        List liste = new ArrayList();
        
        liste.add(this.getCodeArticle());
        liste.add(this.getLibelArticle());
        liste.add(this.getPrixArticle());
        liste.add(this.getQuantiteArticle());
        liste.add(this.getDateCreationArticle());
        
        return liste;
    }

    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getLibelArticle() {
        return libelArticle;
    }

    public void setLibelArticle(String libelArticle) {
        this.libelArticle = libelArticle;
    }

    public double getPrixArticle() {
        return prixArticle;
    }

    public void setPrixArticle(double prixArticle) {
        this.prixArticle = prixArticle;
    }

    public int getQuantiteArticle() {
        return quantiteArticle;
    }

    public void setQuantiteArticle(int quantiteArticle) {
        this.quantiteArticle = quantiteArticle;
    }

    public Date getDateCreationArticle() {
        return dateCreationArticle;
    }

    public void setDateCreationArticle(Date dateCreationArticle) {
        this.dateCreationArticle = dateCreationArticle;
    }
    
}
