package hr.kreso.ucenje.model;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    private long reservationId;
    private Integer bookId;
    private Integer memberId;
    private Date reservationDate;
    private Integer reservationStatus;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Integer getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(Integer reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", bookId=" + bookId +
                ", memberId=" + memberId +
                ", reservationDate=" + reservationDate +
                ", reservationStatus=" + reservationStatus +
                '}';
    }
}
