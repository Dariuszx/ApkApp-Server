package pl.com.wyszkolmniewjedenksiezyc.web;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Event;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.EventService;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EventController {

    private final EventService eventService;

    @RequestMapping(method = RequestMethod.POST)
    public Event add(@RequestBody Event event) {

        return eventService.add(event);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public EmbeddedList<Event> findAll() {
        return new EmbeddedList<>(eventService.findAll());
    }
}
