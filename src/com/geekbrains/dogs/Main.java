package com.geekbrains.dogs;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Red");
        Ball ball2 = new Ball("Greeen");
        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Tuzik");

        dog1.play(ball1);
        dog1.play(ball2);
    }
}
