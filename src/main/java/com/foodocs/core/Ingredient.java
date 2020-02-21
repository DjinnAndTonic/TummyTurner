package com.foodocs.core;

public class Ingredient {
    private int ingredientID;
    private String name;

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
