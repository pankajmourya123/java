 class GDC {
public static void main(String []args) {
    int num1=81,num2=153;
    int gdc=1;
    for(int i=1;i<=num1 && i<=num2;i++){
        if(num1%i==0 && num2%i==0){
            gdc=i;
        }
    }
    System.out.println(gdc);
    
}    
}
