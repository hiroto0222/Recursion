// 末尾に挿入

class SinglyLinkedListNode<E> {
    public E data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(E data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public static SinglyLinkedListNode<Integer> insertAtTail(SinglyLinkedListNode<Integer> head, int data) {
        // 関数を完成させてください
        SinglyLinkedListNode<Integer> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new SinglyLinkedListNode<Integer>(data);

        return head;
    }
}
