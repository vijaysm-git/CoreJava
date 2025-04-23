package BinarySearch;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[]arr={4,3,2,1,5};
        cyclicSort(arr);

            System.out.print(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!= correctIndex) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }else{
                i++;
            }


        }
    }
}
