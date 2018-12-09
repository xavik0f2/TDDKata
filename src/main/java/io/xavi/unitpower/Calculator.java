package io.xavi.unitpower;

public class Calculator {

    public int add(String input) {
        if(input == "") return 0;
        String[] inputSplitted = input.split(",");
        return Integer.parseInt(inputSplitted[0])+Integer.parseInt(inputSplitted[1]);
    }
}