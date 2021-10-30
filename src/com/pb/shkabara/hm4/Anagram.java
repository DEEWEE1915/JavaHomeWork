package com.pb.shkabara.hm4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть першу стрічку:");
        String usersInput1 = in.nextLine();

        System.out.println("Введіть другу стрічку:");
        String usersInput2 = in.nextLine();

        String usersString1 = usersInput1.toLowerCase();
        String usersString2 = usersInput2.toLowerCase();


        if (anagramer(usersString1, usersString2)) {
            System.out.println("анаграма");
        } else {
            System.out.println("не анаграма");
        }

    }

    static boolean anagramer (String s1, String s2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLetter(s1.charAt(i)))
                sb1.append(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (Character.isLetter(s1.charAt(i)))
                sb2.append(s2.charAt(i));
        }

        char[] tempArray1 = sb1.toString().toCharArray();
        char[] tempArray2 = sb2.toString().toCharArray();

        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);




        boolean result = Arrays.equals(tempArray1, tempArray2);

        return result;
    }
}

