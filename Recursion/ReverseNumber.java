package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=10;
        reverse(n,n);
    }
    public static void reverse(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
       reverse(i-1,n); 
    }
}
