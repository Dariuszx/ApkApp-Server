package pl.com.wyszkolmniewjedenksiezyc.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Event;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Localization;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.EventRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.LocalizationRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.EventService;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;
    private final LocalizationRepository localizationRepository;

    @Override
    public Event add(Event event) {

        if(event.getLocalization() != null) {
            Localization localizationDb = localizationRepository.save(event.getLocalization());
            event.setLocalization(localizationDb);
        }

        return eventRepository.save(event);
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
