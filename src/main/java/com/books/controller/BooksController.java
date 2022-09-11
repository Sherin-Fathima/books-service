package com.books.controller;


import com.books.domain.Book;
import com.books.exception.BookNotFoundException;
import com.books.mapper.BooksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BooksController {

    @Autowired
    private BooksMapper booksMapper;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/findBookByIsbn/{isbn}", method = RequestMethod.GET, produces = { "application/json" })
    public Book findBookByIsbn(@PathVariable String isbn) {

        // do something
      Book book =booksMapper.findByIsbn(isbn);
//        if (book) {
//            throw new BookNotFoundException(isbn);
//        }
        return book;


    }
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/addBook", method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
    public Book addBook(@RequestBody Book book) {
        System.out.println(book.toString());
        // do something
        return booksMapper.addBook(book);


    }
    @Override
    public String toString() {
        Book book = new Book();
        String s = "isbn: "+ book.getIsbn() ;
        return s;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/removeBook/{isbn}", method = RequestMethod.GET, produces = { "application/json" })
    public String removeBook(@PathVariable String isbn) {
        //do something
       booksMapper.removeBook(isbn);
       return "removed book with isbn"+ isbn;
    }


}
