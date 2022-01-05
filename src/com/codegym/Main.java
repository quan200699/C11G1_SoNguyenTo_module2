package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while (count < 20) {
            if (number < 2) {
                number++;
                continue;
            } else if (number == 2) {
                System.out.println(number);
                count++;
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                    System.out.println(number);
                }
            }
            number++;
        }

    }
}
