package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
            int firstNumFirstDigit = firstNumber / 10;
            int firstNumSecondDigit = firstNumber % 10;
            int secondNumFirstDigit = secondNumber / 10;
            int secondNumSecondDigit = secondNumber % 10;

            if (firstNumFirstDigit == secondNumFirstDigit || firstNumFirstDigit == secondNumSecondDigit || firstNumSecondDigit == secondNumFirstDigit || firstNumSecondDigit == secondNumSecondDigit) {
                return true;
            }
        return false;
    }
}
