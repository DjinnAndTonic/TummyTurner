package com.foodocs.core;

import java.util.List;

public class Menu {
    private List<MenuItem> menuItemList;

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public String toString(){
        String returnString = "";
        for(MenuItem mi : menuItemList){
            returnString += mi + "\n";
        }
        return returnString;
    }
}
