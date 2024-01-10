class Solution {
    Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);

        Node front = head.next;

        front.next = head;

        head.next = null;

        return newHead;
    }
}