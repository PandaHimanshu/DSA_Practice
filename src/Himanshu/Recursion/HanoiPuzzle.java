package Himanshu.Recursion;

public class HanoiPuzzle {

    public static void TowerOfHanoi(int n,char fromRod,char toRod,char auxRod){
        if(n==1) System.out.println("move disk 1 from "+fromRod+"to "+toRod);
        else {
            TowerOfHanoi(n - 1, fromRod, auxRod, toRod);
            System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
            TowerOfHanoi(n - 1, auxRod, toRod, fromRod);
        }

    }

    public static void main(String[] args) {
        int n=4;
        TowerOfHanoi(n,'A','B','C');
    }
}
