package pl.com.wyszkolmniewjedenksiezyc.domain.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.User;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.UserRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.GenericService;

import java.util.List;


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GenericServiceImpl implements GenericService {

    private final UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }
}
