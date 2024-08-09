package Himanshu;

public class BubbleSort {
    static void bubbleSort(int arr[],int n){
        for (int i=n-1;i>=0;i--){
            for (int j =0;j<i-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After bubble sort :");
        for (int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int arr[]={23,36,123,744,-45};
        int n = arr.length;
        System.out.println("Before bubble sort:");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr,n);
    }
}
