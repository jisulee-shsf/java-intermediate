package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); // O(1)
        set.add(2); // O(n)
        set.add(3); // O(n)
        set.add(4); // O(n)
        set.add(5); // O(n)
        System.out.println(set); // MyHashSetV0{elementData=[1, 2, 3, 4, 5], size=5}

        boolean result = set.add(5);
        System.out.println(result); // false
        System.out.println(set); // MyHashSetV0{elementData=[1, 2, 3, 4, 5], size=5}

        System.out.println(set.contains(5)); // true -> O(n)
        System.out.println(set.contains(100)); // false -> O(n)
    }
}
