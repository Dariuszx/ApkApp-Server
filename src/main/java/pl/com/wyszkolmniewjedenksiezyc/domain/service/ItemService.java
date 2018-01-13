package pl.com.wyszkolmniewjedenksiezyc.domain.service;


import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Item;

public interface ItemService {

    Item save(Item item);
    EmbeddedList<Item> findAll();
}
