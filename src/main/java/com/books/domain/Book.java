package com.books.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("title")
    private String title ;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("authors")
    private String authors;
    @JsonProperty("pageCount")
    private String pageCount;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("haveRead")
    private String haveRead;
    @JsonProperty("thumbnail")
    private String thumbnail;

    public String title() {
        return title;
    }

    public void title(String title) {
        this.title =title;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors= authors;
    }
    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }
    public String getHaveRead() {
        return haveRead;
    }

    public void setHaveRead(String haveRead) {
        this.haveRead = haveRead;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
