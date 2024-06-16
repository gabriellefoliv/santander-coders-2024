package estruturadedados.arvore;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public Node root;

    public static class Node {
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
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (queue.size() > 0) {
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }

                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(final Node node) {
        // R E D
        if (node == null)
            return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(final Node node) {
        // E R D
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(final Node node) {
        // E D R
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    public void BFS() {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
            System.out.println(currentNode.value);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        tree.inOrder();

        // System.out.println(tree.root.value);
        // System.out.println(tree.root.left.value);
        // System.out.println(tree.root.right.value);
    }

}
