package com.mateus.passin.repositories;

import com.mateus.passin.domain.checkIn.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {

}
