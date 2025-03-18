package com.java.vj;

public class FinMin {
    public static void main(String[] args) {
        int[] arr = {18,12,7,14,28,3};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i] < ans){
                ans=arr[i];
                System.out.println(Integer.MIN_VALUE);
            }

        }
        return ans;
    }

}
