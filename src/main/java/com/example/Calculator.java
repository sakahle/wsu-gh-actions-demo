package com.example;

public class Calculator {
    public static void main(String[] args) {
        int result = add(5, 5);
        System.out.println(result);
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
}