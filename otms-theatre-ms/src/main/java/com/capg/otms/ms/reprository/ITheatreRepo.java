package com.capg.otms.ms.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.otms.ms.model.Theatre;

@Repository
public interface ITheatreRepo extends JpaRepository<Theatre, Integer> {

	public Theatre getByTheatreId(Integer theatreId);

	public Theatre getByTheatreName(String theatreName);

}