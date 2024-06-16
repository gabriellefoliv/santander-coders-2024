package estruturadedados.arvbuscabinaria;

public class BST {

    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }

        public boolean isLeaf() {
            return (this.left == null && this.right == null);
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    private void insert(final Node root, final int value) {
        if (root == null)
            return;
        if (value == root.value)
            return;
        if (value > root.value) {
            if (root.right == null) {
                root.right = new Node(value);
            } else {
                insert(root.right, value);
            }
        } else {
            if (root.left == null) {
                root.left = new Node(value);
            } else {
                insert(root.left, value);
            }
        }
    }
}
