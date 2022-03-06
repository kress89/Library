package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.Fine;

import java.util.List;
import java.util.Map;

public interface FineDao {

    List<Fine> fetchFinesByCriteria(Map<String, Object> params);

    int countFinesByCriteria(Map<String, Object> params);
}
