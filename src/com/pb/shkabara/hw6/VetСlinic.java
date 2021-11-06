package com.pb.shkabara.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Cat cat1 = new Cat("миші", "лєжанка", 11);
        Dog dog1 = new Dog("сухий корм", "парк", 25);
        Horse horse1 = new Horse("овес", "стайня", 45);


        Animal[] animals = new Animal[] {cat1, dog1, horse1};

        Class clazz = Class.forName("com.pb.shkabara.hw6.Veterinarian");

        Constructor treatAnimal = clazz.getConstructor(new Class[]{});
        treatAnimal.setAccessible(true);
        Object obj = treatAnimal.newInstance();

        for (int i = 0; i < animals.length; i++)

            ((Veterinarian) obj).treatAnimal(animals[i]);
    }

}
