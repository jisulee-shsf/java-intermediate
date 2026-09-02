package collection.set;

import java.util.Arrays;

public class HashStart3 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println(Arrays.toString(inputArray)); // [null, 1, 2, null, null, 5, null, null, 8, null, null, null, null, null, 14, ..., 99]

        int searchValue = 99;
        Integer result = inputArray[searchValue];
        System.out.println(result); // 99
    }
}
