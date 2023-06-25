package com.geekster.RestaurantInfo.repository;

import com.geekster.RestaurantInfo.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantInfoRepo {
    @Autowired
    private List<Restaurant> restaurantList;

    public List<Restaurant>getRestaurantLists(){
        return restaurantList;
    }

    public void add(Restaurant restaurant){
        restaurantList.add(restaurant);
    }

    public void delete(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }

}
