package collection.compare;

import java.util.LinkedList;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println(list);
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

        list.sort(null);
        System.out.println(list);
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        list.sort(new IdComparator());
        System.out.println(list);
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
    }
}
