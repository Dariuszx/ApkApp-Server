package pl.com.wyszkolmniewjedenksiezyc.domain.service;

import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Event;

import java.util.List;

public interface EventService {

    Event add(Event event);
    List<Event> findAll();
}
