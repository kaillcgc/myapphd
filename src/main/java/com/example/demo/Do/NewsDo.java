package com.example.demo.Do;

import java.util.Date;

public class NewsDo {
    private Long id;
    private String title;
    private String content;
    private String author;
    private Date pubtime;
    private String keyword;
    private Integer acnumber;
    private Integer newstype;
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getNewstype() {
        return newstype;
    }

    public void setNewstype(Integer newstype) {
        this.newstype = newstype;
    }

    public String getNewstypeName() {
        return newstypeName;
    }

    public void setNewstypeName(String newstypeName) {
        this.newstypeName = newstypeName;
    }

    private String newstypeName; // 新增：类型名称
    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getAcnumber() {
        return acnumber;
    }

    public void setAcnumber(Integer acnumber) {
        this.acnumber = acnumber;
    }

}



