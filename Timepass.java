import java.util.HashMap;

 class ArrowRotations {

    

    public static void main(String[] args) {
        int n = 5; 

        
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }

            int number = 1;

            
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " "); 
                number = number * (i - j) / (j + 1); 
            }
            System.out.println(); 
        }
        }
    }

