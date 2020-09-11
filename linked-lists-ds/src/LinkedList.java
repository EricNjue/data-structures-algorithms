import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    // addLast ...
    public void addLast(int item) {
        var node = new Node(item);

        // check if the linked is empty ... if its empty point the head & tail to this node ...
        if (isEmpty())
            first = last = node;
        else  // if list has at least 1 node ...
        {
            last.next = node;
            last = node; // set the new node as the last one ...
        }
        size++;
    }

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        // check if the linked is empty ... if its empty point the head & tail to this node ...
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item)
                return index;

            current = current.next;
            index++;
        }
        return -1;
    }

    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // deleteFirst
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        // check if we have a single node ...
        if (first == last) {
            first = last = null;

        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    // deleteLast
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        // check if we have a single node ...
        if (first == last) {
            first = last = null;

        } else {
            var previous = getPrevious(last);
            last = previous;
            previous.next = null;
        }
        size--;
    }


    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }


    public void reverse() {

        if (isEmpty())
            return;

        var previous = first;
        var current = first.next;

        // [10 -> 20 -> 30]
        //  p     c     n
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;

    }


    public int getKthNodeFromTheEnd(int k) {

        if (isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }

        while (b != last) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }


    public int size() {
        return size;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
