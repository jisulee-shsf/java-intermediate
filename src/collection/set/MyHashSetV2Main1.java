package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set); // MyHashSetV2{buckets=[[], [AB], [], [], [], [A], [B, SET], [C], [D], []], size=6, capacity=10}

        String searchValue = "SET";
        boolean result1 = set.contains(searchValue);
        System.out.println(result1); // true

        boolean result2 = set.remove(searchValue);
        System.out.println(result2); // true
        System.out.println(set); // MyHashSetV2{buckets=[[], [AB], [], [], [], [A], [B], [C], [D], []], size=5, capacity=10}
    }
}
