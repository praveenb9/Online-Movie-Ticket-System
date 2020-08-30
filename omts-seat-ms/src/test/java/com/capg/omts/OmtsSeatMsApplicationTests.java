package com.capg.omts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import com.capg.omts.model.Seat;
import com.capg.omts.model.SeatReader;
import com.capg.omts.model.Seatlist;
import com.capg.omts.service.Seatservice;
import java.util.List;
@SpringBootTest
class OmtsSeatMsApplicationTests {
@Autowired
Seatservice seatService ;
		
		@Test
        public void Addseattest() {
        	SeatReader  seat =new SeatReader(333249,"AVAILABLE",12345);
        	Seat Seat=seatService.addSeat(seat);
        	assertNotNull(Seat);
        }
		@Test
        public void allseatstest() {
          List<Seat> seatlist=seatService.showAvailableSeats();
          assertNotNull(seatlist);
	
		}
}


		