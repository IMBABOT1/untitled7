package com.geekbrains.dogs;

public class Ball {
    private String color;
    private boolean busy;

    public String getColor() {
        return color;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public Ball(String color) {
        this.color = color;
        // this.busy = false;
    }
}
