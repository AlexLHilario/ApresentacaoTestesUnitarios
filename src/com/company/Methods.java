package com.company;

public class Methods {

    public static String example(String name){
        return name;
    }

    public static String login(String username, String password){
        if(username.equals("user123") && password.equals("password2020")) return "pass";
        else return "fail";
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
