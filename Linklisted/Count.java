package Linklisted;

public class Count {
    Node head;
    private int size;
  
  
    Count () {
        size = 0;
    }
  
  
    public class Node {
        int data;
        Node next;
  
  
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
  
  
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
  
  
    public void addLast(int data) {
        Node newNode = new Node(data);
  
  
        if(head == null) {
            head = newNode;
            return;
        }
  
  
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
  
  
        lastNode.next = newNode;
    }

    public static void main(String[] args) {
        Count list = new Count();
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);

        System.out.println(list.size);
    }
}
