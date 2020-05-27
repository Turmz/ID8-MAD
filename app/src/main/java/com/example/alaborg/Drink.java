package com.example.alaborg;

public class Drink {
    private String name;
    private int drawable;

    private Drink() {
    }

    public static Drink of(String name, int drawable) {
        Drink drink = new Drink();
        drink.name = name;
        drink.drawable = drawable;
        return drink;
    }

    public String getName() {
        return name;
    }

    public int getDrawableId() {
        return drawable;
    }
}
