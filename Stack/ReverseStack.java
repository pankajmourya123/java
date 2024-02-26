package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

      Stack<Integer> res=  reverse(s);
      System.out.println(res);
    }

    public static Stack<Integer>  reverse(Stack<Integer>s){

        if(s.isEmpty()){
           
            return s;
        }
        int top =s.pop();
        reverse(s);
        Stack<Integer> temp=new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        temp.push(top);
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
        return s;
    }
}
