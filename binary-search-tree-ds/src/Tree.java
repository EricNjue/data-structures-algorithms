public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("Node=%d", value);
        }
    }

    private Node root;

    public void insert(int value) {

        var node = new Node(value);

        // if the tree is empty ...
        if (root == null) {
            root = node;
            return;
        }

        var current = root;

        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) { // we've a parent :-)
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) { // we've a parent :-)
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }


    public boolean find2(int value) {
        var current = root;

        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public boolean find(int value) {
        // no item in the BST ...
        if (root == null)
            return false;

        // if its one item in the BST ...
        if (root.value == value)
            return true;

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null)
                    return false;

                if (current.leftChild.value == value)
                    return true;
                current = current.leftChild;
            } else {
                if (current.rightChild == null)
                    return false;

                if (current.rightChild.value == value)
                    return true;
                current = current.rightChild;
            }
        }
    }

    private void traversePreOrder(Node root) {
        // root, left, right
        if (root == null)
            return;
        System.out.printf("%d,", root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }


    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.printf("%d,", root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        traverseInOrder(root.rightChild);
        System.out.printf("%d,", root.value);
    }

    public int getNodeHeight() {
        return getNodeHeight(root);
    }

    private int getNodeHeight(Node root) {
        if (root == null)
            return -1;

        if (root.leftChild == null && root.rightChild == null)
            return 0;

        return 1 + Math.max(getNodeHeight(root.leftChild), getNodeHeight(root.rightChild));
    }
}
