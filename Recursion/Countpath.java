package Recursion;

public class Countpath {
    public static void main(String[] args) {
        int m=3, n=3;
       int res= countpath(0,0,m,n);
       System.out.println(res);
    }
    public static int countpath(int i,int j,int m,int n){
        if(i == m-1 || j == n-1) {
            return 1;
        }
 
 
        return countpath(i+1, j, m, n) + countpath(i, j+1, m, n);
}
    }

