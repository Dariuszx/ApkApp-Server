package pl.com.wyszkolmniewjedenksiezyc.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.EmbeddedList;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Item;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.ItemDict;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.ItemDictRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.ItemRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.ItemService;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemDictRepository itemDictRepository;

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public EmbeddedList<Item> findAll() {
        return new EmbeddedList<>(itemRepository.findAll());
    }


}
