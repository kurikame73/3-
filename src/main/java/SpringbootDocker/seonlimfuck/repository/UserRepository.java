package SpringbootDocker.seonlimfuck.repository;

import SpringbootDocker.seonlimfuck.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
