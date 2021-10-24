package com.pb.shkabara.hm3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101);
        Scanner in = new Scanner(System.in);
        int attempt = 0;
        int attemptCount = 0;

        do {
            System.out.println("Вгадайте число від 0 до 100. Для дострокового завершення введіть 1337.");
            attempt = in.nextInt();
            attemptCount++;

            if (attempt == x) {
                System.out.println("Ви вгадали з " + attemptCount + " спроби!" );
                break;
            }else{
                if (attempt == 1337) {
                }else{
                    if (attempt < x ){
                        System.out.println("Загадане число більше!");
                    }else {
                        System.out.println("Загадане число меньше!");
                    }
                }

            }

        }
        while (attempt != 1337);

        System.out.println("gameover");

    }
}