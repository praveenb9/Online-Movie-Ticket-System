/**
 	* Project Name : OnlineMovieTicket 
 	*
 	* 
**/
package com.capg.omts.service;
import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.exceptions.BlockSeatException;
import com.capg.omts.exceptions.BookSeatException;
import com.capg.omts.exceptions.CancelSeatException;
import com.capg.omts.exceptions.SeatExistsException;
import com.capg.omts.exceptions.SeatnotFound;
import com.capg.omts.exceptions.Seatnumberexception;
import com.capg.omts.model.*;
import com.capg.omts.repository.Seatrepository;
import com.capg.omts.model.SeatReader;
/**
* Seatserviceimp implements interface Seatservice
*
* @author  : Kalluri Sai Santosh
* @version : 1.0
* @since   : DD-MM-YYYY 
*/
@Service
public class Seatserviceimp implements Seatservice{
	@Autowired
	Seatrepository seatRepo;
	seatStatus seatStatus ;

/***********************AVAILABLE SEAT*************************************/	
	@Override
	public List<Seat> showAvailableSeats() {
		// TODO Auto-generated method stub

			return seatRepo.showAvailableSeats(seatStatus.AVAILABLE);
		
	}

/************************BOOK SEAT ****************************************/
	@Override
	public List<Seat> bookSeats(Seatlist seatlist) {
		// TODO Auto-generated method stub
		List<Integer> seatIds = seatlist.getSeatlist();

			 for(int seatId:seatIds) {
				 if(seatRepo.existsById(seatId)) {
				 Seat bookseat = seatRepo.getOne(seatId);
				 if(bookseat.getSeatStatus()==seatStatus.BOOKED) {
					 throw new BookSeatException("seat cannot be booked :"+seatId);
				 }
				 }
			 }
			 List<Seat> seatList=new ArrayList<>();
			 for(int seatId:seatIds) {
			if(!seatRepo.existsById(seatId)) {
				throw new SeatnotFound("Seat number " +seatId+ "  not found");
			}
				 Seat bookseat= seatRepo.getOne(seatId);
				if(bookseat.getSeatStatus()==seatStatus.AVAILABLE) {
					bookseat.setSeatStatus(seatStatus.BOOKED);
					seatList.add(bookseat);
				}
			
			 }
			
			 return seatRepo.saveAll(seatList);
			 }

			 

/************************BLOCK SEAT ****************************************/

	@Override
	public List<Seat> blockSeats(Seatlist seatlist) {
		// TODO Auto-generated method stub
		List<Integer> seatIds = seatlist.getSeatlist();
			 for(int seatId:seatIds) {
				 if(seatRepo.existsById(seatId)) {
				 Seat blockseat = seatRepo.getOne(seatId);
				 if(blockseat.getSeatStatus()==seatStatus.BLOCKED) {
					 throw new BlockSeatException("seat cannot be blocked :"+seatId);
				 }
				 }
			 }
				List<Seat> seatList=new ArrayList<>();
				for(int seatId:seatIds) {
					
				if (!seatRepo.existsById(seatId)) {

					throw new SeatnotFound("Seat number " +seatId+ "  not found");
				}
					Seat blockseat = seatRepo.getOne(seatId);
					if (blockseat.getSeatStatus() == seatStatus.AVAILABLE) {
						blockseat.setSeatStatus(seatStatus.BLOCKED);
						seatList.add(blockseat);
					}
				}

				

				return seatRepo.saveAll(seatList);
			}
		

			


/************************CANCEL SEAT ****************************************/
	
	@Override
	public List<Seat> cancelSeats(Seatlist seatlist) {
		// TODO Auto-generated method stub
		List<Integer> seatIds = seatlist.getSeatlist();
		for(int seatId:seatIds) {
			 if(seatRepo.existsById(seatId)) {
			 Seat cancelseat = seatRepo.getOne(seatId);
			 if(cancelseat.getSeatStatus()==seatStatus.AVAILABLE) {
				 throw new CancelSeatException("seat cannot be cancelled: "+seatId);
			 }
			 }
		 }
		List<Seat> seatList=new ArrayList<>();
		for(int seatId:seatIds) {
		if (!seatRepo.existsById(seatId)) {
			throw new SeatnotFound("Seat number " +seatId+ " not found");
		}
			Seat cancelseat = seatRepo.getOne(seatId);
			if (cancelseat.getSeatStatus() == seatStatus.BOOKED) {
				cancelseat.setSeatStatus(seatStatus.AVAILABLE);
				seatList.add(cancelseat);
			}
			}
		

		  return seatRepo.saveAll(seatList);
		}

			

/************************ADD SEAT ****************************************/
	
	@Override
	@Transactional
	public Seat addSeat(SeatReader seatReader)  {
		// TODO Auto-generated method stub
	if (validateSeatId(seatReader.getSeatId())) {
		
	
		if (seatRepo.existsById(seatReader.getSeatId())) {
			throw new SeatExistsException("Seat already exists");
		}
		
			
			switch (seatReader.getSeatStatus()) {
			
			case "BOOKED":
				seatStatus=seatStatus.BOOKED;
				break;
			case "BLOCKED":
				seatStatus=seatStatus.BLOCKED;
				break;
			default:
				seatStatus=seatStatus.AVAILABLE;
				break;
			}		
	}
			Seat seat=new Seat(seatReader.getSeatId(),seatStatus,seatReader.getSeatPrice());
	
			return seatRepo.save(seat);
	
	}

/************************VALIDATION FOR SEAT NUMBER *******************/

	public boolean validateSeatId(int SeatId) throws Seatnumberexception {
		String seat = Integer.toString(SeatId);
		if (!(seat.length() == 6)) {
			throw new Seatnumberexception("SeatId must be minimum six digits"+SeatId);
		}
		return true;	
 }
 }
	

