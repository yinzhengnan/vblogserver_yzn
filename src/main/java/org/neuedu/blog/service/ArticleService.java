package org.neuedu.blog.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.blog.mapper.ArticleMapper;
import org.neuedu.blog.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    public PageInfo getAllArticles(PageInfo page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Article> articles = articleMapper.getAllArticles();
        PageInfo pageInfo = new PageInfo(articles);
        pageInfo.setList(articles);
        return pageInfo;
    }

    public Article getArticleById(Integer aid) {
        return articleMapper.getArticleById(aid);
    }
}
