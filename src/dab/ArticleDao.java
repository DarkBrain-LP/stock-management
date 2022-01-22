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
    public Article getArticleById(int id);
    public boolean deleteArticle(int id);
    public Article updateArticle(Article article);
    public List<Article> listArticle();
}
