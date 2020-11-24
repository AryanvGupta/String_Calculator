package com.company;

import java.util.ArrayList;
import java.util.Arrays;
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

        String[] inpArray = numbers.split("[//,;\n\\\n\\\\n\\[\\]\\\\]+");
        System.out.println("inpArray: " + Arrays.toString(inpArray));

        String pattern = "";
        for (int i=1; i<inpArray.length-1; i++){
            pattern = pattern + "" + inpArray[i];
        }
        pattern = "[" + pattern + "]+";
        System.out.println("pattern: " + pattern);

        String[] intArray = new String[inpArray.length];
        if (pattern.equals("[]+"))
            intArray[0] = "0";
        else
            intArray = inpArray[inpArray.length-1].split(pattern);

        if (!inpArray[0].equals(""))
            intArray = inpArray;

        System.out.println(Arrays.toString(intArray));

        for (int i=0; i<intArray.length; i++){
            int temp = Integer.parseInt(intArray[i]);
            integerList1.add(temp);
        }
        System.out.println("intList1: " + integerList1);
        return integerList1;
    }
}
