package linked_list;

class Node {
        int val;
        Node next;
        Node pre;
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node pre) {
            this.val = val;
            this.next = next;
            this.pre = pre;
        }
    }
public class doublelist {

    Node head;

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.pre = null;
        if (head != null) {
            head.pre = node;
        }
        head = node;

    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (last == null) {
            node.pre = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.pre = last;

    }
    void insertAfterValue(int prevValue, int newData) {
        Node temp = head;
        
        // FIND prev node
        while (temp != null && temp.val != prevValue) {
            temp = temp.next;
        }

        // If not found
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        // INSERT
        Node newNode = new Node(newData);
        newNode.next = temp.next;
        newNode.pre = temp;
        temp.next = newNode;

        if (newNode.next != null) {
            newNode.next.pre = newNode;
        }
    }



    public void display(){
        Node node = head;
        Node last = null;
        
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("end");
        // System.out.println("reverse list");

        // while (last!=null) {
        //     System.out.print(last.val + " -> ");
        //     last = last.pre;
        // }
    }

    public static void main(String[] args) {
        doublelist list = new doublelist();

        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.insertfirst(50);
        list.display();
        list.insertLast(80);
        list.display();

    }
    

        
        
}
