package com.capg.omts.repository;
import java.util.*;

import org.springframework.data.annotation.Persistent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capg.omts.model.*;
@Repository
@Persistent

public interface Seatrepository extends JpaRepository<Seat, Integer> {

	@Query("from Seat where seatStatus=seatStatus")
	public List<Seat> showAvailableSeats(seatStatus seatStatus);
}
