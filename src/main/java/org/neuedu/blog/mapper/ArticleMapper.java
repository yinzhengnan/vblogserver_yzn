package org.neuedu.blog.mapper;

import org.neuedu.blog.model.Article;

import java.util.List;

public interface ArticleMapper {
    List<Article> getAllArticles();

    Article getArticleById(Integer aid);
}
