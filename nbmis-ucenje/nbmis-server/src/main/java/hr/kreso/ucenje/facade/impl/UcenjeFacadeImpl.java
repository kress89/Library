package hr.kreso.ucenje.facade.impl;

import hr.kreso.ucenje.dao.*;
import hr.kreso.ucenje.facade.UcenjeFacade;
import hr.kreso.ucenje.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class UcenjeFacadeImpl implements UcenjeFacade {

    @Autowired
    private AuthorDao authorDao;

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookAuthorDao bookAuthorDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private FineDao fineDao;

    @Autowired
    private FinePaymentDao finePaymentDao;

    @Autowired
    private LoanDao loanDao;

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private MemberStatusDao memberStatusDao;

    @Autowired
    private ReservationDao reservationDao;

    @Autowired
    private ReservationStatusDao reservationStatusDao;

    @Override
    public List<Author> fetchAuthorsByCriteria(Map<String, Object> params) {
        return authorDao.fetchAuthorsByCriteria(params);
    }

    @Override
    public int countAuthorsByCriteria(Map<String, Object> params) {
        return authorDao.countAuthorsByCriteria(params);
    }

    @Override
    public List<Book> fetchBooksByCriteria(Map<String, Object> params) {
        return bookDao.fetchBooksByCriteria(params);
    }

    @Override
    public int countBooksByCriteria(Map<String, Object> params) {
        return bookDao.countBooksByCriteria(params);
    }

    @Override
    public List<BookAuthor> fetchBooksAuthorsByCriteria(Map<String, Object> params) {
       return bookAuthorDao.fetchBooksAuthorsByCriteria(params);
    }

    @Override
    public int countBooksAuthorsByCriteria(Map<String, Object> params) {
       return bookAuthorDao.countBooksAuthorsByCriteria(params);
    }

    @Override
    public int updateBooks(Book book) {
        return bookDao.updateBooks(book);
    }

    @Override
    public int insertBook(Book book) {
        return bookDao.insertBook(book);
    }

    @Override
    public List<Category> fetchCategoriesByCriteria(Map<String, Object> params) {
        return categoryDao.fetchCategoriesByCriteria(params);
    }

    @Override
    public int countCategoriesByCriteria(Map<String, Object> params) {
        return categoryDao.countCategoriesByCriteria(params);
    }

    @Override
    public List<Fine> fetchFinesByCriteria(Map<String, Object> params) {
        return fineDao.fetchFinesByCriteria(params);
    }

    @Override
    public int countFinesByCriteria(Map<String, Object> params) {
        return fineDao.countFinesByCriteria(params);
    }

    @Override
    public List<FinePayment> fetchFinePaymentByCriteria(Map<String, Object> params) {
        return finePaymentDao.fetchFinePaymentByCriteria(params);
    }

    @Override
    public int countFinePaymentByCriteria(Map<String, Object> params) {
        return finePaymentDao.countFinePaymentByCriteria(params);
    }


    @Override
    public List<Loan> fetchLoanByCriteria(Map<String, Object> params) {
        return loanDao.fetchLoanByCriteria(params);
    }

    @Override
    public int countLoanByCriteria(Map<String, Object> params) {
        return loanDao.countLoanByCriteria(params);
    }


    @Override
    public List<Member> fetchMemberByCriteria(Map<String, Object> params) {
        return memberDao.fetchMemberByCriteria(params);
    }

    @Override
    public int countMemberByCriteria(Map<String, Object> params) {
        return memberDao.countMemberByCriteria(params);
    }

    @Override
    public List<MemberStatus> fetchMemberStatusByCriteria(Map<String, Object> params) {
        return memberStatusDao.fetchMemberStatusByCriteria(params);
    }

    @Override
    public int countMemberStatusByCriteria(Map<String, Object> params) {
        return memberStatusDao.countMemberStatusByCriteria(params);
    }

    @Override
    public List<Reservation> fetchReservationByCriteria(Map<String, Object> params) {
        return reservationDao.fetchReservationByCriteria(params);
    }

    @Override
    public int countReservationByCriteria(Map<String, Object> params) {
        return reservationDao.countReservationByCriteria(params);
    }

    @Override
    public List<ReservationStatus> fetchReservationStatusByCriteria(Map<String, Object> params) {
        return reservationStatusDao.fetchReservationStatusByCriteria(params);
    }

    @Override
    public int countReservationStatusByCriteria(Map<String, Object> params) {
        return reservationStatusDao.countReservationStatusByCriteria(params);
    }


}
