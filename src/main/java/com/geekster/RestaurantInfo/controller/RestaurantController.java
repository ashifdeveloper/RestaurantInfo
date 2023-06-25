package com.geekster.RestaurantInfo.controller;

import com.geekster.RestaurantInfo.entity.Restaurant;
import com.geekster.RestaurantInfo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    private List<Restaurant> restaurantList;



    @GetMapping("getRestaurantById/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }

    @GetMapping("getAllRestaurant")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("updateRestaurant/{id}")
    public String updateRestaurant(@PathVariable Long id,@RequestBody Restaurant update) {
        return restaurantService.updateRestaurantInfo(id,update);
    }
//
    @DeleteMapping("deleteRestaurant/{id}")
    public String  deleteRestaurant(@PathVariable Long id) {
        return restaurantService.removeRestaurant(id);

    }
}

