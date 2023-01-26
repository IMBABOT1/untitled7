package com.geekbrains.cats;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Plate plate1 = new Plate(100);
        cat.eat(plate1);
        plate1.info();

        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("Murzik"),
                new Cat("Vasia")
        };

        for (int i = 0; i < cats.length ; i++) {
            cats[i].eat(plate1);
        }

        for (int i = 0; i < cats.length ; i++) {
            System.out.println(cats[i].isSatiety());
        }

        System.out.println(plate1.getFood());

        plate1.addFood(10);

        System.out.println(plate1.getFood());

    }
}
