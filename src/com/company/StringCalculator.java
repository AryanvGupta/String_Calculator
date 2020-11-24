package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator extends Exception {

    int count = 0;

    // Function to calculate the output
    public int Add(String numbers){
        int output = 0;
        List<Integer> inputNum = StrToInt(numbers); // List to store the converted String numbers to Integers

//        System.out.println(inputNum);

        // To check and the return the appropriate value
        if (!numbers.equals("")){
            if (numbers.contains("-")){
                output = -1;
            }
            else {
                for (Integer o : inputNum) {
                    if (o < 1001)
                        output += o;
                }
            }
        }
        count++;
        return output;
    }

    // Function to return how many times Add was called.
    public int GetCalledCount(){
        return count;
    }

    // Function to throw exception when negative numbers are entered
    public List<String> NegativeException(String numbers){
        List<String> negNum = new ArrayList<>();
        String str;

        for (int i=0; i<numbers.length(); i++){
            if (String.valueOf(numbers.charAt(i)).equals("-")){
                str = "-" + numbers.charAt(i + 1);
                negNum.add(str);
            }
        }
        return negNum;
    }

    // Function to convert the String inputs to Integers
    public List<Integer> StrToInt(String numbers){
        List<Integer> integerList1 = new ArrayList<>();

        String[] inpArray = numbers.split("[\n;*,\\[\\]\\\n\\%]+");

        for (int i=0; i<inpArray.length; i++){
            if (inpArray[i].equals(""))
                inpArray[i] = "0";
            int temp = Integer.parseInt(inpArray[i]);
            integerList1.add(temp);
        }
        return integerList1;
    }
}
