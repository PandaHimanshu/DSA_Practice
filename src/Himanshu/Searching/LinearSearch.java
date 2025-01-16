package Himanshu.Searching;


public class LinearSearch {
    public static void main(String[] args) {

//        int nums[]={12,23,43,213,242,-32,24,-234,24,67,87};
//        int target=242;
//        int ans=linearsearch(nums,target);
//        System.out.println(ans);
//    }
//    static int linearsearch(int[]arr,int target){
//        if (arr.length==0){
//            return -1;
//        }
//        for (int i=0;i<=arr.length;i++){
//            int element=arr[i];
//            if (element==target){
//                return element;
//            }
//        }
//        return -1;
        
//        String name="Himanshu";
//        char target='u';
//        System.out.println(linearSearch(name,target));
//    }
//    static boolean linearSearch(String name, char target){
//        if (name.length()==0){
//            return false;
//        }
//        for (int i=0;i<name.length();i++){
//            if (target==name.charAt(i)){
//                return true;
//            }
//        }
//        return false;

//        int[] nums ={12,232,23423,-43,-1234,234};
//        System.out.println(min(nums));

        int[] nums = {764,8337,23322,45,3444,444};
        System.out.println(findNumbers(nums));

    }
//    private static int min(int[] arr){
//        int min = arr[0];
//        for (int j : arr) {
//            if (j < min) {
//                min = j;
//            }
//        }
//        return min;
//    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if (even(num))
                count++;
        }

        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits=digits(num);
        if (numberOfDigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;

        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
