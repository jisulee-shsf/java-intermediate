package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println(member1 == member2); // false
        System.out.println(member1.equals(member2)); // true
        System.out.println(member1.hashCode()); // 104101
        System.out.println(member2.hashCode()); // 104101

        MyHashSetV2 set = new MyHashSetV2(10);
        set.add(member1);
        set.add(member2);
        System.out.println(set); // MyHashSetV2{buckets=[[], [Member{id='idA'}], [], [], [], [], [], [], [], []], size=1, capacity=10}

        Member searchValue = new Member("idA");
        System.out.println(searchValue.hashCode()); // 104101
        boolean result = set.contains(searchValue);
        System.out.println(result); // true
    }
}
