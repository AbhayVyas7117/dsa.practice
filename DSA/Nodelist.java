class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Nodelist {

    public static void main(String[] args) {
        Node n1 = new Node(50);
        Node n2 = new Node(60);
        Node n3 = new Node(70);
        Node n4 = new Node(80);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node temp = n1;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
    }
}
