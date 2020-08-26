package com.capg.otms.ms.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.otms.ms.model.Show;
@Repository
public interface ShowRepo extends JpaRepository<Show,Integer> {

}