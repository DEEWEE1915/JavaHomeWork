package com.pb.shkabara.hw7;

public class Atelier {

    private static Tshirt tshirt1 = new Tshirt(Size.S, 24.00f, "Чорний");
    private static Tshirt tshirt2 = new Tshirt(Size.L, 32.00f, "Білий");
    private static Pants pant = new Pants(Size.XXS, 11.99f, "Жовтий");
    private static Skirt skirt = new Skirt(Size.L, 72.00f, "Зелений");
    private static Tie tie = new Tie(Size.S, 2.00f, "Оранжевий");
    private static Clothes[] clothes = new Clothes[] {tshirt1, tshirt2, pant, skirt, tie};

    public static void main(String[] args) {
        dressMan(clothes);
        dressWomen(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof ManClothes) {
                System.out.print("Чоловік: ");
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.print("Жінка: ");
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }
}