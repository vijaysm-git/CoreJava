package com.java.vj;

public class Solution {


        public static void nForest(int n) {
            // Write your code here
            for(int i=0; i<n; i++){
                for(int j=0 ; j<n; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        public static void main(String[] args) {

            // Here, we have taken the value of N as 5.
            // We can also take input from the user.
            int n = 5;
            nForest(n);
        }
    }






