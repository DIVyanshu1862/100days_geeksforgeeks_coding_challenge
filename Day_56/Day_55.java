class GfG {
    public static int nknode(Node head, int k) {
        double count = 0;
        double k1 = k;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int d = (int) Math.ceil(count / k1);
        temp = head;
        for (int i = 1; i < d - 1; i++) {
            temp = temp.next;
        }
        if (d == 1)
            return temp.data;
        return temp.next.data;
    }
}
