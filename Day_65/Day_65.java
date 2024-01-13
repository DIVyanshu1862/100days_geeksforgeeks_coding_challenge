class GfG {
    public static Node sortedInsert(Node head, int x) {
        // add your code here
        Node temp = new Node(x);

        if (x <= head.data) {
            temp.next = head;
            head.prev = temp;
            temp.prev = null;

            return temp;
        }

        Node currNode = head;

        while (currNode.next != null && x > currNode.data) {
            currNode = currNode.next;
        }
        if (currNode.next == null && x > currNode.data) {
            currNode.next = temp;
            temp.prev = currNode;
            temp.next = null;
        } else {
            currNode = currNode.prev;

            temp.next = currNode.next;
            temp.prev = currNode;

            temp.next.prev = temp;
            currNode.next = temp;
        }

        return head;
    }
}