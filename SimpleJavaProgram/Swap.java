 class Swap {
    public static void main(String []args) {
        int a=10,b=20;
//    t=a;
//    a=b;
//    b=t;
a=a+b;
b=a-b;
a=a-b;
   System.out.println("after swapping a "+a);
   System.out.println(b);
    }
}
