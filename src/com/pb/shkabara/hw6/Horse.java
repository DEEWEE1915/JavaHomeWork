package com.pb.shkabara.hw6;

import java.util.Objects;

public class Horse  extends Animal {
    String name = "Кінь";

    int horseshoeSize;

    public Horse(String food, String location, int horseshoeSize) {
        super(food, location);
        this.horseshoeSize = horseshoeSize;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ірже");
    }

    @Override
    public void eat() {
        System.out.println("Їсть по-конячому");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return horseshoeSize == horse.horseshoeSize && Objects.equals(name, horse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, horseshoeSize);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", horseshoeSize=" + horseshoeSize +
                '}';
    }
}
