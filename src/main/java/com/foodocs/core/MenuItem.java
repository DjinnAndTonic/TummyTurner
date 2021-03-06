package com.foodocs.core;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="MENUITEMS")
public class MenuItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="itemid")
    private int menuItemId;
    private String name;
    private double price;
    @OneToMany(cascade =CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "item")

    private List<Ingredient> ingredientList;

    public MenuItem() {
        super();
    }

    public MenuItem(int menuItemId, String name, double price, List<Ingredient> ingredientList) {
        this.menuItemId = menuItemId;
        this.name = name;
        this.price = price;
        this.ingredientList = ingredientList;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemId=" + menuItemId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", ingredientList=" + ingredientList +
                '}';
    }
}
