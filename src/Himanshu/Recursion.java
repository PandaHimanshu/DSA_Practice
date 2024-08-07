package Himanshu;


public class Recursion {

                //for print 1 to n

//    static void print(int n){
//        if (n==0)return;
//        else {
//            print(n-1);
//            System.out.print(n+" ");
//        }
//    }

                //for print n  to 1

//    static void print(int n){
//        if (n==0)return;
//        else {
//            System.out.print(n+" ");
//            print(n-1);
//        }
//    }

                //print string n times
    static void print(String name,int n){
        int count=0;
        if (count==n)return;
        else {
            System.out.print(name+" ");
            print(name,n-1);
        }
    }
    public static void main(String[] args) {
//        print(10);
        print("hello",5);
    }
}
