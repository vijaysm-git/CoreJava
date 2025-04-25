package com.java.vj;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
      boolean val = search(arr,45);
        System.out.println(val);

    }
     static boolean search (int[][]arr,int target){
        int row = 0;
        int col = arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            }else if(arr[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
     }
}
