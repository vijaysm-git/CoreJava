package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int []arr = {-18,-15,-1,0,1,2,3,5,6,9,10,16};
        int target= 1;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling(int[] arr, int target){

        int start =0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr [end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] ==target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
        }return start;

    }
}
