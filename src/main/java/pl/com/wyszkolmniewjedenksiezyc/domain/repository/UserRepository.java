package pl.com.wyszkolmniewjedenksiezyc.domain.repository;


import org.springframework.data.repository.CrudRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
