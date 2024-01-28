class BinaryToDecimal {
    
    public static void main(String[] args) {
  
    //   // binary number
    //   long b = 1011;
    //    long num=b;
    //   int decimalNumber = 0, i = 0;
    //   long remainder;

    //   while (num != 0) {
    //     remainder = num % 10;
    //     num /= 10;
    //     decimalNumber += remainder * Math.pow(2, i);
    //     ++i;
    //   }
      
    //   System.out.println("Binary to Decimal");
    //   System.out.println( b + " = " + decimalNumber);

    String binary = "1011";

    
    int decimal = Integer.parseInt(binary, 2);
    System.out.println("Binary to Decimal");
      System.out.println( binary + " = " + decimal);

    }  
     
  }