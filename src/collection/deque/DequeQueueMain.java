package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
//        Queue<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque); // []

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque); // [1, 2, 3]

        System.out.println(deque.peek()); // 1

        System.out.println(deque.poll()); // 1
        System.out.println(deque.poll()); // 2
        System.out.println(deque.poll()); // 3
        System.out.println(deque); // []
    }
}
