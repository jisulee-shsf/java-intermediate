package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        MyUser[] array = {user1, user2, user3};
        System.out.println(Arrays.toString(array));
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
    }

    static class IdComparator implements Comparator<MyUser> {
        @Override
        public int compare(MyUser o1, MyUser o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }
}
