package pl.com.wyszkolmniewjedenksiezyc.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Item;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.User;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.ItemService;

@RestController
@RequestMapping("/api/item")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemController {

    private final ItemService itemService;

    @RequestMapping(method = RequestMethod.POST)
    public Item add(@RequestBody Item item) {
        return itemService.save(item);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public EmbeddedList<Item> findAll() {
        return itemService.findAll();
    }

}
