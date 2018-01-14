package pl.com.wyszkolmniewjedenksiezyc.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Role;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.User;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.RoleRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.repository.UserRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.UserService;

import java.util.Arrays;
import java.util.Collections;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public User save(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));

        Role role = roleRepository.findByRoleName("STANDARD_USER");
        user.setRoles(Collections.singletonList(role));

        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void addCoins(Long userId, int value) {

        User user;

        if(userId == null) {
            user = userRepository.findByUsername(
                    SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString()
            );
        } else {
            user = userRepository.findById(userId);
        }

        user.setCoin(user.getCoin() + value);
        userRepository.save(user);
    }

    @Override
    public int getCoin() {
        return userRepository.findByUsername(
                SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString()
        ).getCoin();
    }
}
