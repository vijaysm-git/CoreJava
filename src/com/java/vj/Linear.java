package com.java.vj;

public class Linear {
    public static void main(String[] args) {
        int[] nums = {23,56,55,44,75};
        int target = 100;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }

    static int linearsearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
            return -1;
    }
}
