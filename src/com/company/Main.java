package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();

        System.out.println("Enter the number of inputs: ");
        int n = scanner.nextInt(); // specify the number of inputs
        scanner.nextLine();

        String[] inputArray = new String[n]; // to store various inputs
        String input; // variable for input
        int result; // variable for result

        System.out.println("Enter " + n + " inputs: ");
        // loop to store input in array
        for (int i=0; i<n; i++){
            input = scanner.nextLine();
            inputArray[i] = input;
        }

        // loop to provide the desired output for the given inputs
        for (int i=0; i<n; i++){
            result = stringCalculator.Add(inputArray[i]); // checks the output
            if (result == -1){
                List negNum = stringCalculator.NegativeException(inputArray[i]); // for invalid/negative inputs

                for (Object o : negNum) {
                    System.out.println("negatives not allowed: " + o);
                }
            }
            else {
                System.out.println(result);
            }
        }
        System.out.println("No. of times Add() was called: " + stringCalculator.GetCalledCount()); // to see how many times Add() function is called


//        System.out.println(stringCalculator.Add(""));
//        System.out.println(stringCalculator.Add("1"));
//        System.out.println(stringCalculator.Add("2,1"));
//        System.out.println(stringCalculator.Add("1\n3,2"));
//        System.out.println(stringCalculator.Add("//;\\n1;2"));
//        System.out.println(stringCalculator.NegativeException("-1"));

    }
}
