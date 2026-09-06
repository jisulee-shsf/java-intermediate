package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Object> list2 = Collections.emptyList();
        List<Object> list3 = List.of();

        System.out.println(list1.getClass()); // class java.util.ArrayList
        System.out.println(list2.getClass()); // class java.util.Collections$EmptyList
        System.out.println(list3.getClass()); // class java.util.ImmutableCollections$ListN

        list1.add(1);
//        list2.add(1); -> UnsupportedOperationException
//        list3.add(1); -> UnsupportedOperationException

        List<Integer> list4 = Arrays.asList(1, 2, 3);
        List<Integer> list5 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3};
        List<Integer> list6 = Arrays.asList(arr);
        List<Integer> list7 = List.of(arr);
    }
}
