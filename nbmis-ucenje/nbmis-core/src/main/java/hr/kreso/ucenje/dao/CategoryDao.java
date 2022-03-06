package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.Category;

import java.util.List;
import java.util.Map;

public interface CategoryDao {

    List<Category> fetchCategoriesByCriteria(Map<String, Object> params);

    int countCategoriesByCriteria(Map<String, Object> params);
}
