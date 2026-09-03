package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set); // MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99, 9]], size=7, capacity=10}

        int searchValue = 9;
        boolean result1 = set.contains(searchValue);
        System.out.println(result1); // true

        boolean result2 = set.remove(searchValue);
        System.out.println(result2); // true
        System.out.println(set); // MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99]], size=6, capacity=10}
    }
}
