package io.xavi.unitpower;

public class Calculator {

    public int add(String input) {
        if(input == "") return 0;

        return Integer.parseInt(input);
    }
}