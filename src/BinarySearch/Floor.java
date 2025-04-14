package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int []arr = {-18,-15,-1,0,1,2,3,5,6,9,10,16};
        int target= 7 ;
        int ans = floor(arr,target);
        System.out.println(ans);

    }
    static int floor(int[] arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }

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
        }return end;

    }
}
