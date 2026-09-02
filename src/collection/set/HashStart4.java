package collection.set;

import java.util.Arrays;

public class HashStart4 {

    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println(Arrays.toString(inputArray)); // [null, 1, 2, null, 14, 5, null, null, 8, 99]

        int hashIndex = hashIndex(14);
        System.out.println(hashIndex); // 4
        Integer result = inputArray[hashIndex];
        System.out.println(result); // 14
    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
