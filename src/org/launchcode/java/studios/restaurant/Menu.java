package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by msroc on 5/28/2017.
 */
public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void AddItem(MenuItem newItem){
        this.items.add(newItem);
        this.lastUpdated = new Date();
    }

    public void RemoveItem(MenuItem oldItem) {
        this.items.remove(oldItem);
        this.lastUpdated = new Date();
    }

    public Date GetLastUpdated(){
        return this.lastUpdated;
    }

    public String MenuToString() {
        String strMenu = "";
        for(int i = 0; i < this.items.size(); i++){
            MenuItem mItem =this.items.get(i);
            strMenu += mItem.toString();
        }
        return strMenu;
    }
}
