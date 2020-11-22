package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator extends Exception {

    public int Add(String numbers){
        int output = 0;
        List inputNum = StrToInt(numbers);

//        System.out.println(inputNum);

        if (numbers.equals("")) {
        }
        else {
            for (int i=0; i<inputNum.size(); i++){
                output += (int) inputNum.get(i);
            }
        }
        return output;


//        switch (numbers) {
//            case "":
//                output = 0;
//                break;
//            case "1":
//            case "0,1":
//            case "1,0":
//                output = 1;
//                break;
//            case "2":
//            case "1,1":
//            case "2,0":
//            case "0,2":
//                output = 2;
//                break;
//            case "1,2":
//            case "2,1":
//                output = 3;
//                break;
//            case "2,2":
//                output = 4;
//                break;
//        }

    }

    public static List StrToInt(String numbers){
        List<Integer> integerList1 = new ArrayList<>();
//        int num = Integer.parseInt(numbers.replaceAll(",",""));

        for (int i=0; i<numbers.length(); i++) {
            if (numbers.charAt(i) != ','){
//                System.out.println("char: " + numbers.charAt(i));

                integerList1.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));

//                System.out.println("func list: " + integerList1);
            }
        }
        return integerList1;
    }

}
