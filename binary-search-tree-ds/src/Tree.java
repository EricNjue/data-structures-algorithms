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
}
