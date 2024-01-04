class Tree {
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        g(a, root);
        return a;
    }

    static void g(ArrayList<Integer> a, Node root) {
        if (root == null)
            return;
        g(a, root.left);
        g(a, root.right);
        a.add(root.data);

    }
}