package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println(Arrays.toString(buckets)); // [null, null, null, null, null, null, null, null, null, null]

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println(Arrays.toString(buckets)); // [[], [], [], [], [], [], [], [], [], []]

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 해시 충돌
        System.out.println(Arrays.toString(buckets)); // [[], [1], [2], [], [14], [5], [], [], [8], [99, 9]]

        int searchValue = 9;
        boolean result = contains(buckets, searchValue);
        System.out.println(result); // true
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
