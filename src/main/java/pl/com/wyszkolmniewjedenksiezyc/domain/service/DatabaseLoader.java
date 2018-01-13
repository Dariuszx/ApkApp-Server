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

    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.save("Dariusz", "poziom99");
        userService.save("Radek", "radek");
        userService.save("Konrad", "konrad");
    }
}
