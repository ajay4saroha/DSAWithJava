package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
};

class LinkedList {
    Node head; 

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete (int idx) {
        Node current = head;
        int counter = 0;

        if (idx < 0) {
            System.out.println("Invalid value");
        }

        if (idx == 0) {
            head = current.next;
            return;
        }
        Node prev = head;
        while (current != null) {
            if (idx == counter) {
                prev.next = current.next;
            }
            counter++;
            prev = current;
            current = current.next;
        }
    }

    public void display () {
        Node current = head;
        while(current != null) {
            String connect = current.next != null ? "---->" : "\n";
            System.out.print(current.data + connect);
            current = current.next;
        }
        System.out.println("");
    }
};
public class singlyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
        list.delete(1);
        list.display();
    }
};