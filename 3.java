class LinkedList {
    private Node first;
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void displayList() {
        Node current = first;

        while (current != null) {
            current.displayNode();
            current = current.next;
        }

        //System.out.println("null");
    }
    public void deleteLast() {
    if (first.next == null) {
        first = null; // Only one node exists
        return;
    }

    Node current = first;

    // Stop at the second-last node
    while (current.next.next != null) {
        current = current.next;
    }

    current.next = null; // Remove the last node
}
}

class Node {
    int data;
    Node next = null;

    public void displayNode() {
        System.out.print(data + " -> ");
        if (next == null) {
        System.out.println(next);
    }
    }
}
class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.displayList();
        list.deleteLast();
        list.displayList();
    }
}
