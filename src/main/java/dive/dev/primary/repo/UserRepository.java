package dive.dev.primary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import dive.dev.primary.models.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail, Long>{
}
