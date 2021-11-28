package com.pb.shkabara.hw10;

public class Main {

    public static void main(String[] args){
        NumBox<Float> nbFloat = new NumBox<>(10);
        NumBox<Integer> nbInteger = new NumBox<>(10);

        try {
            nbFloat.add(4.2f);
            nbFloat.add(7.1f);
            nbFloat.add(5.3f);
            nbFloat.add(8.1f);
            nbFloat.add(8.2f);
            nbFloat.add(8.3f);
            nbFloat.add(8.4f);
            nbFloat.add(1.1f);
            nbFloat.add(12.1f);
            nbFloat.add(3.1f);
            nbFloat.add(1.1f);

        }catch (Exception ex)
        {
            System.out.println(ex);
        }

        try {
            System.out.println(nbFloat.get(0));
            System.out.println(nbFloat.get(5));
        }catch (Exception ex)
        {
            System.out.println(ex);
        }
        System.out.println(nbFloat.length());
        System.out.println(nbFloat.average());
        System.out.println(nbFloat.sum());
        System.out.println(nbFloat.max());


        try {
            nbInteger.add(12);
            nbInteger.add(54);
        }catch (Exception ex)
        {
            System.out.println(ex);
        }

        try {
            System.out.println(nbInteger.get(0));
            System.out.println(nbInteger.get(5));
        }catch (Exception ex)
        {
            System.out.println(ex);
        }

        System.out.println(nbInteger.length());
        System.out.println(nbInteger.average());
        System.out.println(nbInteger.sum());
        System.out.println(nbInteger.max());


    }
}
