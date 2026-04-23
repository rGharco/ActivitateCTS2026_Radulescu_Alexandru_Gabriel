package main;

import clase.Restaurant;

public class Main {
    static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getRestaurant("Village Station", 120, 36, 4.8f);
        System.out.println(restaurant1.toString());
        Restaurant restaurant2 = Restaurant.getRestaurant("Village station2", 200, 40, 5f);
        System.out.println(restaurant2.toString());
    }
}