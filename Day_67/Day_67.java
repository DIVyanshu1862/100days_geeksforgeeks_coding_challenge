class GfG {
    Node deleteNode(Node head, int x) {
        // Your code here
        Node curr = head;
        Node prev = null;
        Node after = head.next;
        if (x == 1) {
            head = head.next;
            return head; // WHEN U WANT TO REMOVE 1ST ELEMENT
        }
        for (int i = 0; i < x - 1; i++) {
            prev = curr;
            curr = after;
            after = after.next;

        }
        prev.next = after;
        return head;
    }
}
