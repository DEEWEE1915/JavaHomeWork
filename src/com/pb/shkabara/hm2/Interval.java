package com.pb.shkabara.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.println("Введіть ціле число:");
        number = in.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.println("Число потрапляє в проміжок  [0 -14]");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Число потрапляє в проміжок  [15 -35]");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Число потрапляє в проміжок  [36 -50]");
        } else if (number >= 51 && number <= 100) {
            System.out.println("Число потрапляє в проміжок  [51 -100]");
        } else {
            System.out.println("Число не потрапляє в жоден заданий проміжок.");
        }

    }
}
