package pl.com.wyszkolmniewjedenksiezyc.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.ItemDict;

public interface ItemDictRepository extends CrudRepository<ItemDict, Long> {}