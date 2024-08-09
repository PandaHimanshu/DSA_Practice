package Himanshu;

public class InsertionSort {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("After insertion sort :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        public static void main (String[]args){
            int arr[] = {23, 36, 123, 744, -45};
            int n = arr.length;
            System.out.println("Before insertion sort:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            insertion_sort(arr, n);
        }
}
