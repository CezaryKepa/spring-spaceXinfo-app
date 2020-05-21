package com.kepa.history.model;

public class Links {
    private String reddit;
    private String article;
    private String wikipedia;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("reddit='").append(reddit).append('\'');
        sb.append("article='").append(article).append('\'');
        sb.append("wikipedia='").append(wikipedia).append('\'');

        return sb.toString();
    }

    public String getReddit() {
        return reddit;
    }

    public String getArticle() {
        return article;
    }

    public String getWikipedia() {
        return wikipedia;
    }
}
