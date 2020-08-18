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
	public List<Seat> bookSeats(Seatlist seatlist) {
		// TODO Auto-generated method stub
		List<Integer> seatIds = seatlist.getSeatlist();


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
	public List<Seat> blockSeats(Seatlist seatlist) {
		// TODO Auto-generated method stub
		List<Integer> seatIds = seatlist.getSeatlist();
			 for(int seatId:seatIds) {
				 if(seatRepo.existsById(seatId)) {
				 Seat blockseat = seatRepo.getOne(seatId);
				 
				 }
			 }
				List<Seat> seatList=new ArrayList<>();
				for(int seatId:seatIds) {
					
					Seat blockseat = seatRepo.getOne(seatId);
					if (blockseat.getSeatStatus() == seatStatus.AVAILABLE) {
						blockseat.setSeatStatus(seatStatus.BLOCKED);
						seatList.add(blockseat);
					}
				}

				

				return seatRepo.saveAll(seatList);
			}
	
	@Override
	public List<Seat> cancelSeats(Seatlist seatlist) {
		// TODO Auto-generated method stub
		List<Integer> seatIds = seatlist.getSeatlist();
			 for(int seatId:seatIds) {
				 if(seatRepo.existsById(seatId)) {
				 Seat cancelseat = seatRepo.getOne(seatId);
				 }
			 }
			List<Seat> seatList=new ArrayList<>();
			for(int seatId:seatIds) {
				Seat cancelseat = seatRepo.getOne(seatId);
				if (cancelseat.getSeatStatus() == seatStatus.BOOKED) {
					cancelseat.setSeatStatus(seatStatus.AVAILABLE);
					seatList.add(cancelseat);
				}
				}
			

			  return seatRepo.saveAll(seatList);
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
	

