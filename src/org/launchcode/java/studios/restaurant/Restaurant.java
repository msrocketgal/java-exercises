package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

/**
 * Created by msroc on 5/29/2017.
 */
public class Restaurant {
    public static void main(String[] args){
        MenuItem chocPie = new MenuItem(1.99, "Chocolate Pie", "Dessert");
        MenuItem vegPlate = new MenuItem(5.99, "Vegetable Plate", "Main Course");
        System.out.println(chocPie.toString());
        System.out.println(vegPlate.toString());

        Menu memorialDay = new Menu(new ArrayList<MenuItem>());
        memorialDay.AddItem(chocPie);
        memorialDay.AddItem(vegPlate);
        System.out.println("Menu items:\n" + memorialDay.toString());
    }
}
