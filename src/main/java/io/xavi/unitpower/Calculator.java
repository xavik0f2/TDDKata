package io.xavi.unitpower;

public class Calculator {

    public int add(String inputNumbers) {
        if (inputNumbers == "") return 0;
        if (!inputNumbers.contains(",")) return Integer.parseInt(inputNumbers);
        String[] inputSplitted = inputNumbers.split(",");

        int sum=0;
        for (String number :inputSplitted)
            sum += Integer.parseInt(number);

        return sum;
    }
}