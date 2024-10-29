package Himanshu.Backtracking;

public class NBitStrings {

    public static void generateBits(int[] A, int n) {
        if (n < 1) {
            // Base case: if no bits remain to set, print the array
            printArray(A);
        } else {
            // Recursive case: set the current bit to 0 and generate remaining bits
            A[n - 1] = 0;
            generateBits(A, n - 1);

            // Set the current bit to 1 and generate remaining bits
            A[n - 1] = 1;
            generateBits(A, n - 1);
        }
    }

    private static void printArray(int[] A) {
        for (int bit : A) {
            System.out.print(bit);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4;  // Change n for different bit lengths
        int[] A = new int[n];
        generateBits(A, n);
    }
}

