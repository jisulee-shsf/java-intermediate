package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque); // []

        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque); // [3, 2, 1]

        System.out.println(deque.peek()); // 3

        System.out.println(deque.pop()); // 3
        System.out.println(deque.pop()); // 2
        System.out.println(deque.pop()); // 1
        System.out.println(deque); // []
    }
}
