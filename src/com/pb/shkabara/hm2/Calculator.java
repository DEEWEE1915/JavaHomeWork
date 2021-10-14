package com.pb.shkabara.hm2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int operand2;
        String symbol;
        int result = 0;

        System.out.println("Введіть перше число:");
        operand1 = in.nextInt();
        System.out.println("Введіть друге число:");
        operand2 = in.nextInt();
        System.out.println("Введіть арифметичний знак:");
        symbol = in.next();

        if (symbol.equals("/") && operand2 == 0) {
            System.out.println("Не можна ділити на 0.");
            System.exit(0);
        }


        switch (symbol) {
            case "+":
                result = (operand1 + operand2);
                break;
            case "-":
                result = (operand1 - operand2);
                break;
            case "*":
                result = (operand1 * operand2);
                break;
            case "/":
                result = (operand1 / operand2);
        }

        System.out.println(operand1 + " " + symbol + " " + operand2 + " " + "=" + " " + result);

    }
}
