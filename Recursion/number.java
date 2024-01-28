package Recursion;

public class number {
    public static void main(String[] args) {
        int n=10;
        num(1,n);
    }
    public static void num(int i,int n){
        if(i>n){
            return;
        }

        System.out.println(i);
        num(i+1,n);
    }
}
