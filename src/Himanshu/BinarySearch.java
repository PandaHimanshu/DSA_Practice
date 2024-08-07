package Himanshu;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {728,34,33,23,22,3,-77,-876};
        int target = -22;
        int ans = binarysearch(arr,target);
        System.out.println (ans);
    }
    static int binarysearch(int[] arr,int target){
        int start =0;
        int end=arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
            else {
                if (target>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
//celling means the target is greter and equal (in the return -1 place return start)
//floar means the target is lower and equal(in the return -1 place return end)
