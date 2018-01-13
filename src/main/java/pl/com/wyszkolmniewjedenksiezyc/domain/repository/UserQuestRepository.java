package pl.com.wyszkolmniewjedenksiezyc.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.UserQuest;

import java.util.List;

public interface UserQuestRepository extends CrudRepository<UserQuest, Long> {

    List<UserQuest> findByUserIdAndStatusIsFalse(Long userId);
    List<UserQuest> findByUserIdAndStatusIsTrue(Long userId);
}
