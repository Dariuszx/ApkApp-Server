package pl.com.wyszkolmniewjedenksiezyc.domain.service;

import pl.com.wyszkolmniewjedenksiezyc.domain.entity.User;

import java.util.List;


public interface GenericService {

    User findByUsername(String username);

    List<User> findAllUsers();
}
