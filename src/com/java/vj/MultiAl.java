package com.java.vj;

import java.util.Arrays;
import java.util.Scanner;

public class MultiAl {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 89};
        swap(arr, 1, 4);

        System.out.println(Arrays.toString(arr));
    }
        static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        }

}
