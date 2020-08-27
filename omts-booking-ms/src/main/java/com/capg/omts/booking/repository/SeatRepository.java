package com.capg.omts.booking.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.SeatStatus;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {

	@Query("from Seat where seatStatus=:seatStatus")
	public List<Seat> getAvailableSeats(SeatStatus seatStatus);
}