package org.neuedu.blog.controller.article;

import com.github.pagehelper.PageInfo;
import org.neuedu.blog.model.Article;
import org.neuedu.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @GetMapping("/getAllArticles")
    public PageInfo getAllArticles(PageInfo page) {
        return articleService.getAllArticles(page);
    }

    @GetMapping("/details/{aid}")
    public Article getArticleById(@PathVariable("aid") Integer aid) {
        return articleService.getArticleById(aid);
    }
}
