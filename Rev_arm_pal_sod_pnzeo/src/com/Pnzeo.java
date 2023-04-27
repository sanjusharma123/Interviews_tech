package com;

import java.util.Scanner;
 class Pnzeo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter an integer: ");
            int num = input.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Zeros: " + zeroCount);
        input.close();
    }
}
