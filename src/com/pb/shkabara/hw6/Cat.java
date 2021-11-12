package com.pb.shkabara.hw6;

import java.util.Objects;

public class Cat  extends Animal {
    String name = "Кіт";

    int pawsSize;

    public Cat(String food, String location, int pawsSize) {
        super(food, location);
        this.pawsSize = pawsSize;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мявкає");
    }

    @Override
    public void eat() {
        System.out.println("Їсть по-котячому");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return pawsSize == cat.pawsSize && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pawsSize);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", pawsSize=" + pawsSize +
                '}';
    }
}
