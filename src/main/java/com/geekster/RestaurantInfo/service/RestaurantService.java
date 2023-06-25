package com.geekster.RestaurantInfo.service;

import com.geekster.RestaurantInfo.entity.Restaurant;
import com.geekster.RestaurantInfo.repository.RestaurantInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private List<Restaurant> restaurantList = new ArrayList<>();
    @Autowired
    RestaurantInfoRepo restaurantInfoRepo;

    public Restaurant getRestaurantById(@PathVariable Long id) {
        for (Restaurant restaurant : restaurantInfoRepo.getRestaurantLists()) {
            if (restaurant.getId().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }

    public List<Restaurant> getAllRestaurants() {

        return restaurantInfoRepo.getRestaurantLists();
    }

    public String addRestaurant(Restaurant restaurant) {

        restaurantInfoRepo.add(restaurant);
        return "Restaurant Added";
    }

    public String updateRestaurantInfo(@PathVariable Long id,@RequestBody Restaurant update) {
        for (Restaurant restaurantLists : restaurantInfoRepo.getRestaurantLists()) {
            if (restaurantLists.getId().equals(id)) {
                  restaurantLists.setName(update.getName());
                  restaurantLists.setAddress(update.getAddress());
                  restaurantLists.setPhoneNumber(update.getPhoneNumber());
                  restaurantLists.setSpecialty(update.getSpecialty());
                  restaurantLists.setTotalStaff(update.getTotalStaff());
//

                return "Restaurant Info updated for id" + id;
            }
        }
        return "Restaurant Info not found id:" + id;


    }


public String removeRestaurant(Long id) {
    for (Restaurant restaurant : restaurantInfoRepo.getRestaurantLists()) {
        if (restaurant.getId().equals(id)) {
            restaurantInfoRepo.delete(restaurant);
            return "Restaurant deleted for id " + id;
        }
    }
    return "Restaurant with id " + id + " not found";
}

    }
