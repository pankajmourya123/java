package Recursion;

public class Sum {
    public static void main(String[] args) {
        int n=6;
       int result= sum(n);
       System.out.println(result);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
}
