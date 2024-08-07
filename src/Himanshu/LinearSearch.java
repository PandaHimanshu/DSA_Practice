package Himanshu;


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

        int nums[]={12,232,23423,-43,-1234,234};
        System.out.println(min(nums));
    }
    static int min(int[]nums){
        int ans=nums[0];
        for (int i =1;i<nums.length;i++){
            if (nums[i]<ans){
                ans=nums[i];
            }
        }
        return ans;
    }
}
