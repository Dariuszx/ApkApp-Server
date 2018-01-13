package pl.com.wyszkolmniewjedenksiezyc.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Item;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findAll();
}