package Himanshu;

import java.util.Scanner;

public class pattern {

    //SOLID RECTANGLE
//    public static void main(String[] args) {
//        System.out.println("Enter the value of X & Y:");
//        Scanner sc =new Scanner(System.in);
//        int X=sc.nextInt();
//        int Y=sc.nextInt();
//        for (int i = 1; i <= X; i++) {
//            for (int j = 1; j <= Y; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

    //HOLLOW RECTANGLE
//    public static void main(String[] args) {
//        System.out.println("Enter the value of X & Y:");
//        Scanner sc =new Scanner(System.in);
//        int X=sc.nextInt();
//        int Y=sc.nextInt();
//        for (int i=1;i<=X;i++){
//            for (int j=1;j<=Y;j++){
//                if (i==1||j==1||i==X||j==Y){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }


    //HALF PYRAMID

//    public static void main(String[] args) {
//        System.out.println("Enter the value of X :");
//        Scanner sc =new Scanner(System.in);
//        int X=sc.nextInt();
//        for (int i=1;i<=X;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

    //INVERTED HALF PYRAMID

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc =new Scanner(System.in);
//        int x=sc.nextInt();
//        for (int i=1;i<=x;i++){
//            for (int j=i;j<=x;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

    //INVERTED PYRAMID(ROTATED BY 180)

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc =new Scanner(System.in);
//        int x=sc.nextInt();
//        for (int i=1;i<=x;i++){
//            for (int j=i-1;j<=x;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

    //HALF PYRAMID WITH NUMBERS

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc =new Scanner(System.in);
//        int x=sc.nextInt();
//        for (int i=1;i<=x;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//    }

    //INVERTED HALF PYRAMID WITH NUMBERS

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= x - i + 1; j++)  {
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//    }

    //FLOYD'S TRIANGLE

//        public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int number=1;
//        for (int i=1;i<=x;i++){
//            for (int j=i;j<=x;j++){
//                System.out.print(number);
//                number++;
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
//        }

    //0-1 TRIANGLE

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for (int i=1;i<=x;i++){
//            for (int j=i;j<=x;j++){
//                if ((i+j)%2==0){
//                    System.out.print("1");
//                }
//                else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println(" ");
//        }
//    }


    //SOLID RHOMBUS

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for (int i=1;i<=x;i++){
//            for (int j=1;j<=x-i+1;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j<=x;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

    //NUMBER PYRAMID

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        for (int i=1;i<=x;i++){
//            for (int j=1;j<=x-i+1;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println(" ");
//        }
//    }


    //palindromic number pyramid

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for (int i=1;i<=x;i++){
//            for (int j=1;j<=x-i+1;j++){
//                System.out.print(" ");
//            }
//            //for first part
//            for (int j =i;j>=1;j--){
//                System.out.print(j);
//            }
//            //for second part
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//    }


    //BUTTERFLY PATTERN

//    public static void main(String[] args) {
//        System.out.println("Enter the value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (x - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = x; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (x - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

                //DIAMOND PATTERN

    public static void main(String[] args) {
        System.out.println("Enter the value of x:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=1;i<=x;i++){
            for (int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i=x;i>=1;i--){
            for (int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
