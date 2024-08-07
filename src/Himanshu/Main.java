package Himanshu;

public class Main {
    public static void main(String[] args) {
       int[] arr={2,545,234,656,35};
        System.out.println(maxno(arr));
    }

    private static int maxno(int[] arr) {
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}