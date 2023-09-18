package me.jhs.dto;

import lombok.Getter;
import lombok.Setter;
import me.jhs.domain.Article;

@Getter
public class ArticleListViewResponse {
    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.content = article.getContent();
        this.title = article.getTitle();
    }
}
