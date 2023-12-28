package blehu.health.mailservice.repository;

import blehu.health.mailservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
