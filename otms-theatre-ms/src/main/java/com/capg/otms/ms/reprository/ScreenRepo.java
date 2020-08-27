package com.capg.otms.ms.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.otms.ms.model.Screen;
@Repository
public interface ScreenRepo extends JpaRepository<Screen, Integer> {

}