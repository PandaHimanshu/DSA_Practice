package Himanshu;
import java.util.Arrays;


public class leetcode3079 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {10, 21, 31};

        System.out.println(sumofEncriptNo(nums1)); // Output: 6
        System.out.println(sumofEncriptNo(nums2));
    }
    public static int sumofEncriptNo(int []nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            int num=nums[i];
            sum+=encrypt(num);
        }
        return sum;
    }
    public static int encrypt(int x){
        int mxDigit=Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
        return Integer.parseInt(String.valueOf(mxDigit).repeat(String.valueOf(x).length()));
    }
}

