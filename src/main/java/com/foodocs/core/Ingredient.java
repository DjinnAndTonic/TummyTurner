package com.foodocs.core;

import javax.persistence.*;

@Entity
@Table(name="INGREDIENTS")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int ingredientID;
    private String name;
    @ManyToOne(targetEntity = MenuItem.class)
    @JoinColumn(name="ITEMID")
    private MenuItem item;

    public Ingredient(){
        super();
    }

    public Ingredient(int ingredientID, String name) {
        this.ingredientID = ingredientID;
        this.name = name;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientID=" + ingredientID +
                ", name='" + name + '\'' +
                '}';
    }
}
