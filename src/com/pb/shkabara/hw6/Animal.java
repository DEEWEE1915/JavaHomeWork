package com.pb.shkabara.hw6;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Шумить");
    }

    public void eat() {
        System.out.println("Їсть");
    }

    public void sleep() {
        System.out.println("Спить..");
    }
}
