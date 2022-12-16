// DoublyLinkedListクラス

class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList(int[] vals) {
        if (vals.length <= 0) {
            this.head = null;
            this.tail = this.head;
            return;
        }

        this.head = new Node(vals[0]);
        Node currNode = this.head;
        for (int i = 1; i < vals.length; i++) {
            currNode.next = new Node(vals[i]);
            currNode.next.prev = currNode;
            currNode = currNode.next;
        }
        this.tail = currNode;
    }
}

class MyClass {
    public static void main(String[] args) {
        int[] vals = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        DoublyLinkedList numList = new DoublyLinkedList(vals);

        System.out.println(numList.head.data);
        System.out.println(numList.head.next.data);
        System.out.println(numList.head.next.prev.data);
        System.out.println(numList.tail.data);
        System.out.println(numList.tail.prev.data);
        System.out.println(numList.tail.prev.prev.data);
    }
}
