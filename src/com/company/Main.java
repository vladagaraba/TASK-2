package com.company;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x from -1000 to 1000 ");
        int num = scanner.nextInt();

        System.out.println(getResult(num));
    }
    //Основная цель нашей программы определить знак,четность и разрядность числа.
    // Следовательно возвращаемое значениеи является результатом, которое ожидает пользователь.
    //Поэтому такое название функции допустимо,с учетом того,
    // что возвращаемое значение, в не контекста задачи тяжело обобщить.
    public static String getResult(int num) {
        if (num > 1000 || num < -1000) {
            return ("number out of range [-1000, 1000]");
        } else if (num == 0) {
            return ("number is null");

        } else {
            return (getNumericalCharacteristics(num));
        }
    }

    private static String getNumericalCharacteristics(int num) {
        String result = "Number is";
        result += getParityFunction(num);
        result += getPositivityFunctions(num);
        result += getDigitCapacity(num);
        return result;
    }

    private static String getDigitCapacity(int num) {
        if (abs(num) < 10) {
            return " one-digit";

        } else if (10 <= abs(num) && abs(num) < 100) {
            return " two-digit";
        } else if (100 <= abs(num) && abs(num) < 1000) {
            return " three-digit";
        } else {
            return " four-digit";
        }
    }

    private static String getPositivityFunctions(int num) {
        return num > 0 ? " positive" : " not positive";
    }

    private static String getParityFunction(int num) {
        return num % 2 == 0 ? " oven" : " not oven";

    }
}
