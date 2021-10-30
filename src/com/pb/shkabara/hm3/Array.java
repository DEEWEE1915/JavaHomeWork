package com.pb.shkabara.hm3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int userValue = 0;
        Scanner in = new Scanner(System.in);

        for (int counter = 0; counter <array.length; counter++){
            System.out.println("Введіть в масив елемент під номером " + counter);
            userValue = in.nextInt();
            array[counter] = userValue;
        }

        for (int counter = 0; counter < array.length; counter++) {
            System.out.print(array[counter] + " ");
        }

        System.out.println();

        int sum = 0;

        for (int counter = 0; counter < array.length; counter++) {
            sum = sum + array[counter];
        }

        int positiveElements = 0;

        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] > 0) {
                positiveElements++;
            }
        }

        System.out.println("Сума всіх елементів масива: " + sum);
        System.out.println("Кількість позитивних елементів масива: " + positiveElements);

        int done = 1;
        int save = 0;

        while (done != 0) {
            done = 0;
            for (int counter = 0; counter < array.length-1; counter++) {
                if (array[counter] > array[counter + 1]) {
                        done = done + 1;
                        save = array[counter];
                        array[counter] = array[counter + 1];
                        array[counter + 1] = save;
                }
            }

        }

        System.out.println("Відсортований по алгоритму бульбашки масив:");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.print(array[counter] + " ");
        }

    }
}
