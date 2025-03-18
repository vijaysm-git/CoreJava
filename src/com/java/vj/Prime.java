package com.java.vj;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int n = in.nextInt();

        // Check if the entered number is an Armstrong number
        boolean ans = isArmstrong(n);
        System.out.println("Is the number an Armstrong number? " + ans);

        // Find and display Armstrong numbers between 100 and 999
        System.out.println("Armstrong numbers between 100 and 999 are:");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    static boolean isArmstrong(int n) {
        int original = n; // Store the original number
        int sum = 0;

        // Calculate the sum of the cubes of its digits
        while (n > 0) {
            int rem = n % 10;   // Extract the last digit
            n = n / 10;        // Remove the last digit
            sum = sum + rem * rem * rem; // Add the cube of the digit
        }

        // Return true if the sum equals the original number
        return sum == original;
    }
}
