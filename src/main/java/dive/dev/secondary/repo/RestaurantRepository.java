package dive.dev.secondary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import dive.dev.secondary.models.Restaurant;


public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
