package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]

        System.out.println(Collections.min(list)); // 1
        System.out.println(Collections.max(list)); // 3

        Collections.shuffle(list);
        System.out.println(list); // [3, 1, 2]

        Collections.sort(list);
        System.out.println(list); // [1, 2, 3]

        Collections.reverse(list);
        System.out.println(list); // [3, 2, 1]
    }
}
