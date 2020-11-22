package com.company;

public class Main {

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();

        System.out.println(String.valueOf(stringCalculator.Add("")));
        System.out.println(String.valueOf(stringCalculator.Add("1")));
        System.out.println(String.valueOf(stringCalculator.Add("2")));
        System.out.println(String.valueOf(stringCalculator.Add("1,2")));
        System.out.println(String.valueOf(stringCalculator.Add("2,1")));
        System.out.println(String.valueOf(stringCalculator.Add("2,2")));
        System.out.println(String.valueOf(stringCalculator.Add("0,2")));
        System.out.println(String.valueOf(stringCalculator.Add("1,0")));
    }
}
