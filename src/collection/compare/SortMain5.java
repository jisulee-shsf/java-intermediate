package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        TreeSet<MyUser> set1 = new TreeSet<>();
        set1.add(user1);
        set1.add(user2);
        set1.add(user3);
        System.out.println(set1);
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        TreeSet<MyUser> set2 = new TreeSet<>(new IdComparator());
        set2.add(user1);
        set2.add(user2);
        set2.add(user3);
        System.out.println(set2);
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
    }
}
