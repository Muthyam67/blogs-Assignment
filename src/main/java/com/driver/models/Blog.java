package com.driver.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Blog{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    private String title;
    private String content;
    public Date pubDate;

    public Blog(int id,String title,String content,Date pubDate) {
        this.id = id;
        this.title=title;
        this.content=content;
        this.pubDate=pubDate;
    }

    public Blog() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @ManyToOne
    @JoinColumn
    private User user;
    @OneToMany(mappedBy = "blog", cascade=CascadeType.ALL)
    private List<Image> ImageList;

    public List<Image> getImageList() {
        return ImageList;
    }

    public void setImageList(List<Image> imageList) {
        ImageList = imageList;
    }

    public int getId() {
        return id;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}