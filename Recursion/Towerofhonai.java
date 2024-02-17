package Recursion;

public class Towerofhonai {
    public static void main(String[] args) {
        int n=3;
        towerofhonai( n,"S","H","D");
    }
    public static void towerofhonai(int i,String src,String helper,String destion){
        if(i==1){
            // System.out.println("transfer disk " +i+ " from "+src +" to "+destion);
            return;
        }
        towerofhonai(i-1, src, destion, helper);
        // System.out.println("transfer disk " +i+ " from "+src +" to "+destion);
        
        towerofhonai(i-1, helper, src, destion);

    }
}
