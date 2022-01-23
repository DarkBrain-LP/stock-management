/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

/**
 *
 * @author M@nU_LP
 */
public interface EnregistrementControler {
    public boolean controlCodeArticle(String code);
    public boolean controlLibelArticle(String libel);
    public boolean controlPrixArticle(String prix);
    public boolean controlQte(String qte);
    public boolean controlDateCreation(String date);
    public double getPrixArticle(String prix);
}
