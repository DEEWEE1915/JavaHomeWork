package com.pb.shkabara.hw10;

public class NumBox <T extends Number> {

    private T[] arrT;
    private int arrAdd = 0;

    public NumBox(int size) {
        arrT = (T[]) new Number[size];
    }

    public void add(T num) throws Exception {

        if (arrAdd > arrT.length - 1) {
            throw new Exception("масив переповнено");
        }

        arrT[arrAdd++] = num;
    }

    public T get(int ind) throws Exception {

        if (ind >= arrAdd) {
            throw new Exception("такого елементу немає");
        }

        return arrT[ind];
    }

    public int length() {
        return arrAdd;
    }

    public double average() {

        double average = 0;

        for (int i = 0; i < arrAdd; i++) {

            average += arrT[i].doubleValue();
        }

        return average / arrAdd;
    }

    public double sum() {
        double sum = 0;

        for (int i = 0; i < arrAdd; i++) {

            sum += arrT[i].doubleValue();
        }

        return sum;
    }

    public T max() {
        int ind = 0;
        double maxElem = 0;

        for (int i = 0; i < arrAdd; i++) {

            if (arrT[i].doubleValue() > maxElem) {
                maxElem = arrT[i].doubleValue();
                ind = i;
            }

        }

        return arrT[ind];
    }
}