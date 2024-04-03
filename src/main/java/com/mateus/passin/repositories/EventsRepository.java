package com.mateus.passin.repositories;

import com.mateus.passin.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Event, String> {

}
