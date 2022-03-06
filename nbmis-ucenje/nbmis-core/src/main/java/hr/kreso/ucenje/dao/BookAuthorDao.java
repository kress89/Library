package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.BookAuthor;

import java.util.List;
import java.util.Map;

public interface BookAuthorDao {
    List<BookAuthor> fetchBooksAuthorsByCriteria(Map<String, Object> params);

    int countBooksAuthorsByCriteria(Map<String, Object> params);
}
