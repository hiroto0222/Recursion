class SinglyLinkedListNode<E> {
    public E data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(E data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public static SinglyLinkedListNode<Integer> doubleEvenNumber(SinglyLinkedListNode<Integer> head) {
        // 関数を完成させてください
        SinglyLinkedListNode<Integer> curr = head;
        int i = 0;
        while (curr != null) {
            if (i % 2 == 0) {
                SinglyLinkedListNode<Integer> temp = curr.next;
                curr.next = new SinglyLinkedListNode<Integer>(2 * curr.data);
                curr.next.next = temp;
                curr = temp;
            } else {
                curr = curr.next;
            }
            i++;
        }

        return head;
    }
}
