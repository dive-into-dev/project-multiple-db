package dive.dev.secondary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dive.dev.secondary.models.Restaurant;
import dive.dev.secondary.repo.RestaurantRepository;

@RestController
public class RestaurantController {
	
	@Autowired
	RestaurantRepository restaurantRepo;
	
	@GetMapping("/restaurtants")
	List<Restaurant> getRestaurants() {
		return restaurantRepo.findAll();
	}
	
	@PostMapping(path = "/restaurtants")
	List<Restaurant> addRestaurant(@RequestBody Restaurant restaurant){
		restaurantRepo.save(restaurant);
		return restaurantRepo.findAll();
	
	}

}
