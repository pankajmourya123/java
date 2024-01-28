package Recursion;

public class ReverseNumber2 {
public static void main(String[] args) {
    //  print 10 to 1 without using n-1 (backtracking)
int n=10;
    reverse(1,n);
}

public static void reverse(int i, int n){
    if(i>n){
        return;
    }
    reverse(i+1, n);
    System.out.println(i);
}
}
