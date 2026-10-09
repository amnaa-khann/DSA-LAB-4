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
    }
}

/*
First node -> null, second nodes have a address and some data
Logic is implemented to move forward as more nodes are entered into the linked list
Data & Address both are printed using displayNode(); Method
 */