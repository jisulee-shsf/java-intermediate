package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add(new Member("hi"));
        set.add(new Member("JPA"));
        set.add(new Member("java"));
        set.add(new Member("spring"));
        System.out.println(set); // MyHashSetV2{buckets=[[Member{id='hi'}, Member{id='JPA'}], [], [], [], [], [], [Member{id='spring'}], [], [], [Member{id='java'}]], size=4, capacity=10}

        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println(result); // true
    }
}
