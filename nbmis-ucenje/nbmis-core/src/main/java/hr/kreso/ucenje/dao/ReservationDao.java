package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.Reservation;

import java.util.List;
import java.util.Map;

public interface ReservationDao {

    List<Reservation> fetchReservationByCriteria(Map<String, Object> params);

    int countReservationByCriteria(Map<String, Object> params);
}
