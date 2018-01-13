package pl.com.wyszkolmniewjedenksiezyc.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRoleName(String roleName);
}