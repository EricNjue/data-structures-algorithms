import java.util.Arrays;

public class ArrayQueue {

    private int[] items;

    private int rear;
    private int count;
    private int front;

    public ArrayQueue(int capacity) {
        this.items = new int[capacity];
    }

    // Enqueue
    public void enqueue(int item) {

        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length; // this will create the circular array ...
        count++;
    }

    // Dequeue
    public int dequeue() {
        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length; // this will create the circular array ...
        count--;
        return item;
    }

    // IsEmpty

    // IsFull


    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
