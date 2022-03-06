package hr.kreso.ucenje.model;

import java.io.Serializable;

public class ReservationStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private long reservationStatusId;
    private String statusName;


    public long getReservationStatusId() {
        return reservationStatusId;
    }

    public void setReservationStatusId(long reservationStatusId) {
        this.reservationStatusId = reservationStatusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        return "ReservationStatus{" +
                "reservationStatusId=" + reservationStatusId +
                ", statusName='" + statusName + '\'' +
                '}';
    }
}
