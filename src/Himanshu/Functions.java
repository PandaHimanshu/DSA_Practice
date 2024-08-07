package Himanshu;

import java.util.Scanner;

public class Functions {
//    public static void printMyName(String name){
//        System.out.println("my name is "+name);
//        return;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        printMyName(name);
//    }

//    public static int sumNumber(int num1,int num2){
//        System.out.println("The sum of two numbers are "+(num1+num2));
//        return 1;
//    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        sumNumber(num1,num2);
//    }




//    public static void factorialNumber(int n){
//        if (n<0) {
//            System.out.println("Invalid");
//            return;
//        }
//        int factorial=1;
//        for (int i=n;i>=1;i--){
//            factorial=factorial*i;
//        }
//        System.out.println(factorial);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        factorialNumber(n);
//    }

//Write a function to print the sum of all odd numbers from 1 to n.

    public static void printSumOfOddNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum =sum+i;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }
    public static void main(String[] args) {
        printSumOfOddNumbers(10);
    }
}
