package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println(deque); // [2, 1, 3, 4]

        System.out.println(deque.peekFirst()); // 2
        System.out.println(deque.peekLast()); // 4

        System.out.println(deque.pollFirst()); // 2
        System.out.println(deque.pollFirst()); // 1
        System.out.println(deque.pollLast()); // 4
        System.out.println(deque.pollLast()); // 3
        System.out.println(deque); // []
    }
}
