package com.thoughtworks.tdd;

public class FizzBuzz {
    public String eachTime(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }

        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            result = String.valueOf(number);
        }

        return result;
    }
}
