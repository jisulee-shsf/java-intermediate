package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.getClass());
        // class java.util.ImmutableCollections$ListN

//        list.add(4); -> UnsupportedOperationException

        ArrayList<Integer> mutableList = new ArrayList<>(list);
        System.out.println(mutableList.getClass());
        // class java.util.ArrayList

        List<Integer> immutableList = Collections.unmodifiableList(mutableList);
        System.out.println(immutableList.getClass());
        // class java.util.Collections$UnmodifiableRandomAccessList
    }
}
