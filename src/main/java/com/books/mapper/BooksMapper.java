
package com.books.mapper;


import com.books.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BooksMapper {
    @Select("SELECT * FROM books WHERE isbn = #{isbn}")
    public Book findByIsbn(String isbn);

    @Select("insert into books (isbn, title, authors, pageCount, haveRead, notes, thumbnail) values ( #{isbn}, #{title}, #{authors},#{pageCount},#{haveRead},#{notes}, #{thumbnail})")

    public Book addBook(Book book);

    @Select("DELETE FROM books WHERE isbn = #{isbn}")
    public Book removeBook(String isbn);


}
