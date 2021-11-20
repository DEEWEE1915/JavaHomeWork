package com.pb.shkabara.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть логін: ");
        String login = scan.next();
        System.out.println("Введіть пароль: ");
        String pass = scan.next();
        System.out.println("Введіть пароль ще раз: ");
        String passConfirm = scan.next();

        Auth auth = new Auth();
        try{
            auth.signUp(login, pass, passConfirm);
            System.out.println("Введіть логін: ");
            login = scan.next();
            System.out.println("Введіть пароль: ");
            pass = scan.next();
            auth.signIn(login, pass);
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}