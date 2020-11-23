package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "-1,5,-6,6\n654";


        int result = stringCalculator.Add(input);

        if (result == -1){
            List negNum = stringCalculator.NegativeException(input);

            for (int i=0;i<negNum.size();i++){
                System.out.println("negatives not allowed: " + negNum.get(i));
            }
        }

//        System.out.println(stringCalculator.Add(""));
//        System.out.println(stringCalculator.Add("1"));
//        System.out.println(stringCalculator.Add("2,1"));
//        System.out.println(stringCalculator.Add("1\n3,2"));
//        System.out.println(stringCalculator.Add("//;\\n1;2"));
//        System.out.println(stringCalculator.NegativeException("-1"));

    }
}
