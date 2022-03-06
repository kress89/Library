package hr.kreso.ucenje.facade;

import hr.kreso.ucenje.model.*;

import java.util.List;
import java.util.Map;

public interface UcenjeFacade {

    List<Author> fetchAuthorsByCriteria(Map<String, Object> params);

    int countAuthorsByCriteria(Map<String, Object> params);

    List<Book> fetchBooksByCriteria(Map<String, Object> params);

    int updateBooks(Book book);

    int insertBook(Book book);

    int countBooksByCriteria(Map<String, Object> params);

    List<BookAuthor> fetchBooksAuthorsByCriteria(Map<String, Object> params);

    int countBooksAuthorsByCriteria(Map<String, Object> params);

    List<Category> fetchCategoriesByCriteria(Map<String, Object> params);

    int countCategoriesByCriteria(Map<String, Object> params);

    List<Fine> fetchFinesByCriteria(Map<String, Object> params);

    int countFinesByCriteria(Map<String, Object> params);

    List<FinePayment> fetchFinePaymentByCriteria(Map<String, Object> params);

    int countFinePaymentByCriteria(Map<String, Object> params);

    List<Loan> fetchLoanByCriteria(Map<String, Object> params);

    int countLoanByCriteria(Map<String, Object> params);

    List<Member> fetchMemberByCriteria(Map<String, Object> params);

    int countMemberByCriteria(Map<String, Object> params);

    List<MemberStatus> fetchMemberStatusByCriteria(Map<String, Object> params);

    int countMemberStatusByCriteria(Map<String, Object> params);

    List<Reservation> fetchReservationByCriteria(Map<String, Object> params);

    int countReservationByCriteria(Map<String, Object> params);

    List<ReservationStatus> fetchReservationStatusByCriteria(Map<String, Object> params);

    int countReservationStatusByCriteria(Map<String, Object> params);
}
