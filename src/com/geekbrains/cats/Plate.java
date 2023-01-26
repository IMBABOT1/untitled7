package com.geekbrains.cats;

public class Plate {
    private int food;


    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food: " + food);
    }


    public void addFood(int amount){
        food += amount;
    }
}
