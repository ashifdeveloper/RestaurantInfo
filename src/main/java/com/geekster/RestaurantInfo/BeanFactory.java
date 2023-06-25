package com.geekster.RestaurantInfo;

import com.geekster.RestaurantInfo.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanFactory {
    @Bean
    public ArrayList<Restaurant> getDataSource(){

        return new ArrayList<>();
    }
}