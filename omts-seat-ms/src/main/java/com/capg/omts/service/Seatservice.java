/**
 	* Project Name : OnlineMovieTicket 
 	*
 	* 
**/
package com.capg.omts.service;
/**
* Interface Seatservice  for  add,book,block,cancel,available seats.
*
* @author  : Kalluri Sai Santosh
* @version : 1.0
* @since   : DD-MM-YYYY 
*/

import java.util.List;
import com.capg.omts.model.SeatReader;
import com.capg.omts.model.Seatlist;
import com.capg.omts.model.Seat;

public interface Seatservice {
	
	
	 public List<Seat> showAvailableSeats();
	
	 public List<Seat> bookSeats(Seatlist seatIds);

		
	 public List<Seat> blockSeats(Seatlist seatIds);

		
	 public List<Seat> cancelSeats(Seatlist seatIds);

	 public Seat addSeat(SeatReader seatReader);
	
	
}


