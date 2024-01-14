class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        if (head.next == null) {
            return head;
        }
        Node newnode = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newnode;
    }
}