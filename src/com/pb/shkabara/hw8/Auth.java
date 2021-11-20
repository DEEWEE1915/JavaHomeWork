package com.pb.shkabara.hw8;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if(login.length() < 5 || login.length() > 20 || !login.matches("[a-zA-Z]+")){
            throw new WrongLoginException("Непідходящий логін");
        }

        if(!password.equals(confirmPassword) || password.length() < 6 || !password.matches("[A-Za-z0-9_]+")){
            throw new WrongPasswordException("Непідходящий пароль");
        }

        this.login = login;
        this.password = password;
        System.out.println("Реєстрація пройшла успішно!");
    }

    public void signIn(String login, String password) throws WrongLoginException{
        if(login.equals(this.login) && password.equals(this.password)){
            System.out.println("Авторизація пройшла успішно!");
        } else {
            throw new WrongLoginException("Невірний логін або пароль.");
        }
    }
}
