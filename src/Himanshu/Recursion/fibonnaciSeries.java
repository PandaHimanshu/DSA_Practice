package Himanshu.Recursion;

public class fibonnaciSeries {

     static int fibonacciNumber(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibonacciNumber(n-1)+fibonacciNumber(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(4));
    }
}
