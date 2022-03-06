package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.FinePayment;

import java.util.List;
import java.util.Map;

public interface FinePaymentDao {
    List<FinePayment> fetchFinePaymentByCriteria(Map<String, Object> params);

    int countFinePaymentByCriteria(Map<String, Object> params);
}
