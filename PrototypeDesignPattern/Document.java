package com.ParkingLot.ParkingLot2.CreationalDesignPattern.PrototypeDesignPattern;

public class Document implements DocumentPrototype {
    private String title;
    private String author;
    private String content;
    private String font;
    private String pageSize;
    public Document(String title, String author,String content,String font,String pageSize){
        this.author=author;
        this.content=content;
        this.title=title;
        this.font=font;
        this.pageSize=pageSize;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getFont() {
        return font;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public Document copy() {
        return new Document(
                this.title,
                this.author,
                this.content,
                this.font,
                this.pageSize
        );
    }
}
