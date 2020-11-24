package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();

//        System.out.println("Enter the number of inputs: ");
//        int n = scanner.nextInt();

//        String[] inputArray = new String[n];
        String input = "2;%53[*]\n4";

//        for (int i=0; i<n;i ++){
//            input = scanner.nextLine();
//            inputArray[i] = input;
//        }
//
//        for (int i=0; i<n; i++){
//
//        }


        int result = stringCalculator.Add(input);

        if (result == -1){
            List negNum = stringCalculator.NegativeException(input);

            for (int i=0;i<negNum.size();i++){
                System.out.println("negatives not allowed: " + negNum.get(i));
            }
        }
        else {
            System.out.println(result);
        }
        System.out.println("No. of times Add() was called: " + stringCalculator.GetCalledCount());

//        System.out.println(stringCalculator.Add(""));
//        System.out.println(stringCalculator.Add("1"));
//        System.out.println(stringCalculator.Add("2,1"));
//        System.out.println(stringCalculator.Add("1\n3,2"));
//        System.out.println(stringCalculator.Add("//;\\n1;2"));
//        System.out.println(stringCalculator.NegativeException("-1"));

    }
}
