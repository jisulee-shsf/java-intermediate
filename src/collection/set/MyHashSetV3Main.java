package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set); // MyHashSetV3{buckets=[[], [], [], [], [], [A], [B], [C], [], []], size=3, capacity=10}

        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println(result); // true
    }
}
