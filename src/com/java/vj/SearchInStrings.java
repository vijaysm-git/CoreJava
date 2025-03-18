    package com.java.vj;

    import java.util.Arrays;

    public class SearchInStrings {
        public static void main(String[] args) {
            int[] arr= {1, 2, 3 ,5, 4 };
            int target= 6;
            System.out.println(linearsearch(arr,target,1, 4));
        }
    //        System.out.println(search(name, target));


    //        static boolean search (String str,char target){
    //            if (str.length() == 0) {
    //                return false;
    //            }
    //            for (char ch : str.toCharArray()) {
    //                if (ch == target) {
    //                    return true;
    //                }
    //
    //            }
    //            return false;

    //    static boolean search(String str, char target) {
    //        if (str.length() == 0) {
    //
    //            return false;
    //        }
    //        for (int i = 0; i < str.length(); i++) {
    //            if (target == str.charAt(i)) {
    //                return true;
    //
    //            }
    //        }
    //        return false;
            static int linearsearch (int[] arr, int target ,int start,  int end) {
                if (arr.length == 0) {
                    return -1;
                }

                for (int index = start; index < end; index++) {
                    int element = arr[index];
                    if (element == target) {
                        return index;
                    }
                }
                return 0;
            }
    }

