package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {

    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");

        print(printQueue.poll());
        print(printQueue.poll());
        print(printQueue.poll());
        /*
        출력 = doc1
        출력 = doc2
        출력 = doc3
        */
    }

    private static void print(String string) {
        System.out.println("출력 = " + string);
    }
}
