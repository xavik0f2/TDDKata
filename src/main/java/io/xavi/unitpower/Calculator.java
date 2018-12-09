package io.xavi.unitpower;

public class Calculator {

    public int add(String input) {
        if (input == "") return 0;
        if (!input.contains(",")) return Integer.parseInt(input);
        String[] inputSplitted = input.split(",");

        int sum=0;
        for (String sumando:inputSplitted)
            sum += Integer.parseInt(sumando);

        return sum;
    }
}