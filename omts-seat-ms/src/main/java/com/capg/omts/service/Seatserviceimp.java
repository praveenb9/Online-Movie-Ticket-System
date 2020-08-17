package com.capg.omts.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.model.*;
import com.capg.omts.repository.Seatrepository;
import com.capg.omts.model.SeatReader;
 @Service
public class Seatserviceimp implements Seatservice{
	@Autowired
	Seatrepository seatRepo;
	seatStatus seatStatus ;
	
	@Override
	public List<Seat> showAvailableSeats() {
		// TODO Auto-generated method stub

			return seatRepo.showAvailableSeats(seatStatus.AVAILABLE);
		
	}
	@Override
	public List<Seat> bookSeats(List<Integer> seatIds) {
		// TODO Auto-generated method stub
		 for(int seatId:seatIds) {
			 if(seatRepo.existsById(seatId)) {
			 Seat bookseat = seatRepo.getOne(seatId);
			 }
		 }
		 List<Seat> seatList=new ArrayList<>();
		 for(int seatId:seatIds) {
			 Seat bookseat= seatRepo.getOne(seatId);
			if(bookseat.getSeatStatus()==seatStatus.AVAILABLE) {
				bookseat.setSeatStatus(seatStatus.BOOKED);
				seatList.add(bookseat);
			}
		
		 }
		
		 return seatRepo.saveAll(seatList);
	}
	@Override
	public List<Seat> blockSeats(List<Integer> seatIds) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Seat> cancelSeats(List<Integer> seatIds) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	@Transactional
	public Seat addSeat(SeatReader seatReader) {
		// TODO Auto-generated method stub
		
			
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
			Seat seat=new Seat(seatReader.getSeatId(),seatStatus,seatReader.getSeatPrice());
		return seatRepo.save(seat);
	}
	}
	

