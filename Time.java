import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Time {
    public static void main(String[] args) {
     
                int[][] grid = {{1, 2}, {3, 4}};
            int res=0;
                int max=Integer.MIN_VALUE;
                for (int i = 0; i < grid.length; i++) {
                    int rowSum = 0; 
                    for (int j = 0; j < grid[i].length; j++) {
                        rowSum += grid[i][j]; 
                    }
                    System.out.println("Sum of row " + i + ": " + rowSum);

                    if(rowSum>max){
                        max=rowSum;
                        res=i;
                    }
                }

                // for (int i = 0; i < grid[0].length; i++) {
                //     int colSum = 0; 
                //     for (int j = 0; j < grid.length; j++) {
                //         colSum += grid[j][i]; 
                //     }
                //     System.out.println("Sum of row " + i + ": " + colSum);
                // }
            }
        }
        
      

