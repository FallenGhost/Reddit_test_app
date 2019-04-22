package com.unitomega.reddit_test_app.model.entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by User on 4/18/2017.
 */

@Root(name = "entry", strict = false)
public class Entry implements Serializable{

    @Element(name = "content")
    private String content;

    @Element(required = false,name = "author")
    private Author author;

    @Element(name = "id")
    private String id;

    @Element(name = "title")
    private String title;

    @Element(name = "updated")
    private String updated;

    @Element(name = "score")
    private String score;

    @Element(name = "num_comments")
    private String num_comments;

    @Element(name = "permalink")
    private String permalink;

    public Entry() {

    }

    public Entry(String content, Author author, String title, String updated, String score, String num_comments, String permalink) {
        this.content = content;
        this.author = author;
        this.title = title;
        this.updated = updated;
        this.score = score;
        this.num_comments = num_comments;
        this.permalink = permalink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScore() {   return score;  }

    public void setScore(String score) {  this.score = score;  }

    public String getNum_comments() {  return num_comments;  }

    public void setNum_comments(String num_comments) {   this.num_comments = num_comments; }

    public String getPermalink() {  return permalink;  }

    public void setPermalink(String permalink) {  this.permalink = permalink;  }

    @Override
    public String toString() {
        return "\n\nEntry{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", updated='" + updated + '\'' +
                ", score='" + score + '\'' +
                ", num_comments='" + num_comments + '\'' +
                '}'+ "\n" +
                "--------------------------------------------------------------------------------------------------------------------- \n";
    }
}
