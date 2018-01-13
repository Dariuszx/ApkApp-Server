package pl.com.wyszkolmniewjedenksiezyc.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.*;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.ItemDictRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.ItemRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.LocalizationRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.UserRepository;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DatabaseLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final ItemDictRepository itemDictRepository;
    private final LocalizationRepository localizationRepository;
    private final ItemRepository itemRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

//        User user = new User();
//        user.setUsername("admin");
//        user.setPassword("poziom9");
//
//        ItemDict coinItem = new ItemDict();
//        coinItem.setName("MINICOIN");
//
//        Localization localization = new Localization();
//        localization.setLongitude(new BigDecimal(52.2177009));
//        localization.setLatitude(new BigDecimal(20.977573));
//
//
//        ItemDict itemDictDb = itemDictRepository.save(coinItem);
//        Localization localizationDb = localizationRepository.save(localization);
////        User userDb = userRepository.save(user);
//
//        Item item = new Item();
//        item.setLocalization(localizationDb);
//        item.setItem(itemDictDb);
//
//        Item itemDb = itemRepository.save(item);
    }
}
