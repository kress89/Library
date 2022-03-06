package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.ReservationStatus;

import java.util.List;
import java.util.Map;

public interface ReservationStatusDao {

    List<ReservationStatus> fetchReservationStatusByCriteria(Map<String, Object> params);

    int countReservationStatusByCriteria(Map<String, Object> params);
}
