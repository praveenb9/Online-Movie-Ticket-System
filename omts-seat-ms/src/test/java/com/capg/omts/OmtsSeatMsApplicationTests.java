package com.capg.omts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.omts.model.Seat;
import com.capg.omts.model.SeatReader;
import com.capg.omts.service.Seatservice;

@SpringBootTest
class OmtsSeatMsApplicationTests {

			Seatservice seatService ;
		
		@Test
        public void Addseattest() {
        	SeatReader  seat =new SeatReader(123456,"AVAILABLE",100000);
        	Seat Seat=seatService.addSeat(seat);
        	assertEquals(123456, Seat.getSeatId());
        }
}


		