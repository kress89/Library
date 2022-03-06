package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.Book;

import java.util.List;
import java.util.Map;

public interface BookDao {

    List<Book> fetchBooksByCriteria(Map<String, Object> params);

    int countBooksByCriteria(Map<String, Object> params);

    int updateBooks(Book book);

    int insertBook(Book book);
}
