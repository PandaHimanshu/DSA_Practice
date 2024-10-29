package Himanshu.Backtracking;

public class KLengthStrings {

    public static void generateStrings(int[] A, int n, int k) {
        if (n < 1) {
            // Base case: if no positions are left, print the array
            printArray(A);
        } else {
            // Recursive case: for each digit from 0 to k-1, set the current position and generate remaining positions
            for (int i = 0; i < k; i++) {
                A[n - 1] = i;
                generateStrings(A, n - 1, k);
            }
        }
    }

    private static void printArray(int[] A) {
        for (int digit : A) {
            System.out.print(digit);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;  // Length of the string
        int k = 3;  // Number of characters (0 to k-1)
        int[] A = new int[n];
        generateStrings(A, n, k);
    }
}

