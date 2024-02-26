package Stack;

import java.util.Stack;

public class Addatlast {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int add = 6;
        // Stack<Integer> res=   addatlast(s,add);
        // System.out.println(res);
        System.out.println(s);
        insertAtBottom(s, add);
        System.out.println(s); // Print the stack after all insertions
    }

    public static Stack<Integer> addatlast(Stack<Integer> s, int add) {
        if (s.isEmpty()) {
            s.push(add);
            return s;
        }

        int top = s.pop();
        addatlast(s, add);

        s.push(top);
        return s;
    }

    public static void insertAtBottom(Stack<Integer> St, int element) {
        if (St.isEmpty()) {
            St.push(element);
            return;
        }

        int curTopElement = St.pop();
        insertAtBottom(St, element);
        St.push(curTopElement);
    }
}
