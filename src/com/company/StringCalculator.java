package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator extends Exception {

    public int Add(String numbers){
        int output = 0;
        List<Integer> inputNum = StrToInt(numbers);

//        System.out.println(inputNum);

        if (!numbers.equals("")){
            if (numbers.contains("-")){
                output = -1;
            }
            else {
                for (Integer o : inputNum) {
                    output += o;
                }
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

    public List<String> NegativeException(String numbers){
        List<String> negNum = new ArrayList<>();
        String str;

        for (int i=0; i<numbers.length(); i++){
            if (String.valueOf(numbers.charAt(i)).equals("-")){
                str = "-" + numbers.charAt(i + 1);
                negNum.add(str);
            }
        }
//        System.out.println(negNum);
        return negNum;
    }

    public List<Integer> StrToInt(String numbers){
        List<Integer> integerList1 = new ArrayList<>();
//        int num = Integer.parseInt(numbers.replaceAll(",",""));

        for (int i=0; i<numbers.length(); i++) {
            if ((int)numbers.charAt(i) >= 48 && (int)numbers.charAt(i) <= 57){
//                System.out.println("char: " + numbers.charAt(i));

                integerList1.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));

//                System.out.println("func list: " + integerList1);
            }
        }
        return integerList1;
    }

}
