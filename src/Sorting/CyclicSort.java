package Sorting;

import java.util.Arrays;

import static Sorting.SortingAlgos.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[]arr={4,3,2,1,5};
        sort(arr);

            System.out.print(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!= arr[correctIndex]) {
               swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
