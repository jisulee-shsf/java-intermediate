package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "a", 2, "b");

        System.out.println(list); // [1, 2, 3]
        System.out.println(set); // [1, 3, 2]
        System.out.println(map); // {1=a, 2=b}

        System.out.println(list.getClass()); // class java.util.ImmutableCollections$ListN
        System.out.println(set.getClass()); // class java.util.ImmutableCollections$SetN
        System.out.println(map.getClass()); // class java.util.ImmutableCollections$MapN
    }
}
