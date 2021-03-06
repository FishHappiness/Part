package com.cvte.part.bean;

import java.util.Date;

public class Article {
    private Integer articleId;

    private String author;

    private String title;

    private String content;

    public Article() {
    }

    public Article(Integer articleId, String author, String title, String content, Date publicationTime) {
        this.articleId = articleId;
        this.author = author;
        this.title = title;
        this.content = content;
        this.publicationTime = publicationTime;
    }

    private Date publicationTime;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }
}