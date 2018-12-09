package io.xavi.unitpower;

public class Calculator {

    public int add(String input) {

        String[] delimiters = {",", "\n"};

        if (inputIsNull(input)) return 0;

        if (inputWithoutDelimiter(delimiters, input)) return Integer.parseInt(input);

        String[] numbers = splitNumbers(delimiters, input);

        return sum(numbers);

    }

    private boolean inputWithoutDelimiter(String[] delimiters, String input) {
        return (!input.contains(delimiters[0]) && !input.contains(delimiters[1]));
    }

    private String[] splitNumbers(String[] delimiters, String input) {
        String regexDelimiters = delimiters[0] + "|" + delimiters[1];
        return input.split(regexDelimiters);

    }

    private int sum(String[] inputs) {
        int sum = 0;
        for (String number : inputs)
            sum += Integer.parseInt(number);

        return sum;
    }

    private boolean inputIsNull(String input) {
        return input == "";
    }

}