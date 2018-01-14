package pl.com.wyszkolmniewjedenksiezyc.domain.service;

import pl.com.wyszkolmniewjedenksiezyc.domain.entity.User;

public interface UserService {

    User save(String username, String password);
    User findByUsername(String username);

    void addCoins(Long userId, int value);
    int getCoin();
}
