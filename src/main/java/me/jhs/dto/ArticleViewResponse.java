package me.jhs.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jhs.domain.Article;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String author;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreated_at();
        this.author = article.getAuthor();
    }
}
