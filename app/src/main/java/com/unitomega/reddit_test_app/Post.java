package com.unitomega.reddit_test_app;

public class Post {
    private String title;
    private String author;
    private String date_updated;
    private String thumbnailURL;
    private String id;
    private String score;
    private String num_comments;
    private String permalink;

    public Post(String title, String author, String date_updated, String thumbnailURL, String id,
                String score, String num_comments, String permalink) {
        this.title = title;
        this.author = author;
        this.date_updated = date_updated;
        this.thumbnailURL = thumbnailURL;
        this.id = id;
        this.score = score;
        this.num_comments = num_comments;
        this.permalink = permalink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }

    public String getScore() { return score; }

    public String getNum_comments() {  return num_comments; }

    public void setScore(String score) { this.score = score; }

    public void setNum_comments(String comments) { this.num_comments = comments; }

    public String getPermalink() {  return permalink;  }

    public void setPermalink(String permalink) { this.permalink = permalink;  }
}
