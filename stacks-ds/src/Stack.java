// stack implementation using arrays ...

import java.util.Arrays;

public class Stack {

    private int[] items = new int[5];
    private int count;

    public void push(int value) {
        if (count == items.length)
            throw new StackOverflowError();

        items[count++] = value;
    }

    public int pop() {

        if (count == 0)
            throw new IllegalStateException();

        count--;
        return items[count];
    }

    public int peek() {

        if (count == 0)
            throw new IllegalStateException();

        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {

        int[] copy = Arrays.copyOfRange(items, 0, count);
        return "Stack{" +
                "items=" + Arrays.toString(copy) +
                ", count=" + count +
                '}';
    }
}
