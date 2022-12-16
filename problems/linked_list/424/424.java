// 連結リストの逆表示

class SinglyLinkedListNode<E> {
    public E data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(E data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public static SinglyLinkedListNode<Integer> reverseLinkedList(SinglyLinkedListNode<Integer> head) {
        // 関数を完成させてください
        SinglyLinkedListNode<Integer> prev = null, next = null;
        SinglyLinkedListNode<Integer> curr = head;
        while (curr != null) {
            // store next node
            next = curr.next;

            // reverse curr node
            curr.next = prev;

            // update prev/curr nodes
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
