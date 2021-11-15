package com.pb.shkabara.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, Float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Спідниця, розмір: " + getSize().getDescription(getSize()) + ": " + getSize() + " " +
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
