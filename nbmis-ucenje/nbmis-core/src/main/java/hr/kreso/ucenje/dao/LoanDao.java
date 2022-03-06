package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.Loan;

import java.util.List;
import java.util.Map;

public interface LoanDao {

    List<Loan> fetchLoanByCriteria(Map<String, Object> params);

    int countLoanByCriteria(Map<String, Object> params);
}
