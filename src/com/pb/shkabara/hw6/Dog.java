package com.pb.shkabara.hw6;

import java.util.Objects;

public class Dog  extends Animal {

    String name = "Собака";

    int runningSpeed;

    public Dog(String food, String location, int runningSpeed) {
        super(food, location);
        this.runningSpeed = runningSpeed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гавкає");
    }

    @Override
    public void eat() {
        System.out.println("Їсть по-собачому");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return runningSpeed == dog.runningSpeed && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, runningSpeed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", runningSpeed=" + runningSpeed +
                '}';
    }
}
