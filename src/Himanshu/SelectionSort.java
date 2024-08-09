package Himanshu;

public class SelectionSort {

    static void SelectionSort(int arr[],int n){
        for (int i = 0 ; i < n-1;i++){
            int minval=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minval]){
                    minval=j;
                }
            }
            //swap
            int temp = arr[minval];
            arr[minval]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After selection sort :");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={23,36,123,744,-45};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        SelectionSort(arr,n);
    }
}
