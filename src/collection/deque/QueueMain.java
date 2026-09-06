package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> stack = new ArrayDeque<>();

        stack.offer(1);
        stack.offer(2);
        stack.offer(3);
        System.out.println(stack); // [1, 2, 3]

        System.out.println(stack.peek()); // 1

        System.out.println(stack.poll()); // 1
        System.out.println(stack.poll()); // 2
        System.out.println(stack.poll()); // 3
        System.out.println(stack); // []
    }
}
