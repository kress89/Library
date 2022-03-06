package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.Author;

import java.util.List;
import java.util.Map;

public interface AuthorDao {
    List<Author> fetchAuthorsByCriteria(Map<String, Object> params);

    int countAuthorsByCriteria(Map<String, Object> params);
}
