package com.geekbrains.cats;

public class Cat {
    private String name;
    private boolean satiety;
    private int amount;


    public Cat(String name) {
        this.name = name;
        this.satiety = false;
        this.amount = 10;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        if (p.getFood() >= amount){
            System.out.println(name + " кушает");
            p.decreaseFood(amount);
            satiety = true;
        }else {
            System.out.println("not enough food");
        }

    }
}
