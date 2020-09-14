import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }


//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//
//        int item = queue.dequeue();
//        System.out.println(item);
//        System.out.println(queue);


//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//
//        int item = queue.dequeue();
//        System.out.println(item);
//        System.out.println(queue);


//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//
//        reverse(queue);
    }

    // Reversing a queue ...
    public static void reverse(Queue<Integer> queue) {
        System.out.println(queue);
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}
