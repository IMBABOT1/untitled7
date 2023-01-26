package com.geekbrains.dogs;

public class Dog {
    private String name;
    private Ball ball; // null

    public Dog(String name) {
        this.name = name;
    }

    public void play(Ball b) {
        if (ball == b) {
            System.out.println(name + " уже играет с данным мячом");
            return;
        }
        if (!b.isBusy()) {
            if (ball != null) {
                stop();
            }
            System.out.println(name + " играет с " + b.getColor());
            b.setBusy(true);
            ball = b;
        } else {
            System.out.println(name + " не может играть с мячом, он занят");
        }
    }

    public void stop() {
        if (ball != null) {
            System.out.println(name + " перестает играть с " + ball.getColor());
            ball.setBusy(false);
            ball = null;
        } else {
            System.out.println(name + ": а я ни с чем и не играю");
        }
    }
}
