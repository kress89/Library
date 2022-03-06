package hr.kreso.ucenje;

import hr.kreso.ucenje.facade.UcenjeFacade;
import hr.kreso.ucenje.model.Book;
import hr.kreso.ucenje.util.SpringFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UcenjeFacade ucenjeFacade = SpringFactory.getUcenjeFacade();

      /*  Map<String, Object> params = new HashMap<>();
        params.put("id", 2);
        List<Author> authors = ucenjeFacade.fetchAuthorsByCriteria(params);


        Map<String, Object> params1 = new HashMap<>();
        params1.put("id", 2);
        List<Book> books = ucenjeFacade.fetchBooksByCriteria(params1);

        Map<String, Object> params2 = new HashMap<>();
        params2.put("bookId", 2);
        List<BookAuthor> booksauthors = ucenjeFacade.fetchBooksAuthorsByCriteria(params2);

        Map<String, Object> catParams = new HashMap<>();
        catParams.put("categoryId", 1);
        List<Category> category = ucenjeFacade.fetchCategoriesByCriteria(catParams);

        Map<String, Object> fineParams = new HashMap<>();
        fineParams.put("fineId", 2);
        List<Fine> fine = ucenjeFacade.fetchFinesByCriteria(fineParams);

        Map<String, Object> finePaymentParams = new HashMap<>();
        finePaymentParams.put("finePaymentId", 2);
        List<FinePayment> finePayment = ucenjeFacade.fetchFinePaymentByCriteria(finePaymentParams);

        Map<String, Object> loanParams = new HashMap<>();
        loanParams.put("loanId", 2);
        List<Loan> loan = ucenjeFacade.fetchLoanByCriteria(loanParams);

        Map<String, Object> memberParams = new HashMap<>();
        memberParams.put("memberId", 2);
        List<Member> member = ucenjeFacade.fetchMemberByCriteria(memberParams);

        Map<String, Object> memberStatusParams = new HashMap<>();
        memberStatusParams.put("memberStatusId", 2);
        List<MemberStatus> memberStatus = ucenjeFacade.fetchMemberStatusByCriteria(memberStatusParams);


        Map<String, Object> reservationParams = new HashMap<>();
        reservationParams.put("reservationId", 2);
        List<Reservation> reservation = ucenjeFacade.fetchReservationByCriteria(reservationParams);

        Map<String, Object> reservationStatusParams = new HashMap<>();
        reservationStatusParams.put("reservationStatusId", 2);
        List<ReservationStatus> reservationStatus = ucenjeFacade.fetchReservationStatusByCriteria(reservationStatusParams);
*/
        Map<String, Object> params11 = new HashMap<>();
        params11.put("title", "Viking");
        List<Book> vikings = ucenjeFacade.fetchBooksByCriteria(params11);




/*      System.out.println(authors);
        System.out.println(books);
        System.out.println(booksauthors);
        System.out.println(category);
        System.out.println(fine);
        System.out.println(finePayment);
        System.out.println(loan);
        System.out.println(member);
        System.out.println(memberStatus);
        System.out.println(reservation);
        System.out.println(reservationStatus);*/
        System.out.println(vikings);
    }
}
