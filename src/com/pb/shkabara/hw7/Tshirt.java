package com.pb.shkabara.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, Float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка, розмір: " + getSize().getDescription(getSize()) + ": " + getSize() + " " +
                getSize().getEuroSize(getSize()) + ", ціна - " + getPrice() + ", колір - " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка, розмір: " + getSize().getDescription(getSize()) + ": " + getSize() + " " +
                getSize().getEuroSize(getSize()) + ", ціна - " + getPrice() + ", колір - " + getColor());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
