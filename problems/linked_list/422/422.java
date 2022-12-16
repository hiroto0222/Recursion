// 連結リストのインデックス検索

class SinglyLinkedListNode<E> {
    public E data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(E data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public static int getIndexValue(SinglyLinkedListNode<Integer> head, int index) {
        // 関数を完成させてください
        SinglyLinkedListNode<Integer> curr = head;
        while (index > 1) {
            curr = curr.next;
            index--;
        }
        return curr.data;
    }
}
