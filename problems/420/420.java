class Item {
    public int data;
    public Item next;

    public Item(int data) {
        this.data = data;
    }
}

class SinglyLinkedList {
    public Item head;

    public SinglyLinkedList(Item head) {
        this.head = head;
    }

    public void printList() {
        for (Item curr = this.head; curr != null; curr = curr.next) {
            System.out.println(curr.data);
        }
    }
}

class MyClass {
    public static void main(String[] args) {
        Item item1 = new Item(7);
        Item item2 = new Item(99);
        Item item3 = new Item(45);

        item1.next = item2;
        item2.next = item3;

        SinglyLinkedList numList = new SinglyLinkedList(item1);
        numList.printList();
    }
}
