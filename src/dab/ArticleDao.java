/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dab;

import entity.Article;
import java.util.List;

/**
 *
 * @author M@nU_LP
 */
public interface ArticleDao {
    public boolean createArticle(Article article);
    public Article getArticleByCode(String code);
    public boolean deleteArticle(int id);
    public boolean updateArticle(Article ancien, Article nouveau);
    public List<Article> listArticle();
    public int nombreTotalArticle();
    public List<Article> rechercher(String element, int... cond );
    /*public List<Article> rechercherCode(String element);
    public List<Article> rechercherLibel(String element);
    public List<Article> rechercherQuantite(String element);
    */
}
