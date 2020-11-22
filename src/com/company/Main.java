package com.company;

public class Main {

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();

        System.out.println(stringCalculator.Add(""));
        System.out.println(stringCalculator.Add("1"));
        System.out.println(stringCalculator.Add("2"));
        System.out.println(stringCalculator.Add("1,3,2"));
        System.out.println(stringCalculator.Add("2,1"));
        System.out.println(stringCalculator.Add("2,2"));
        System.out.println(stringCalculator.Add("0,2"));
        System.out.println(stringCalculator.Add("1,0"));
    }
}
