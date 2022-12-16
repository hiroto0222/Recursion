class SinglyLinkedListNode<E> {
    public E data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(E data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public static SinglyLinkedListNode<Integer> removeNthNode(SinglyLinkedListNode<Integer> head, int n) {
        int size = getSize(head);
        if (n == 0 || n > size) {
            return head;
        }

        SinglyLinkedListNode<Integer> dummyNode = new SinglyLinkedListNode<Integer>(0);
        dummyNode.next = head;
        SinglyLinkedListNode<Integer> currNode = dummyNode;
        for (int i = 0; i < size - n; i++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        return dummyNode.next;
    }

    static int getSize(SinglyLinkedListNode<Integer> head) {
        int size = 0;
        SinglyLinkedListNode<Integer> currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }
}
