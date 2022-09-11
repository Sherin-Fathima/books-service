package com.books.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String exception) {
        super(exception);
    }

}
