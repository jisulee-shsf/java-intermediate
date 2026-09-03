package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MemberNoHashNoEq member1 = new MemberNoHashNoEq("idA");
        MemberNoHashNoEq member2 = new MemberNoHashNoEq("idA");

        System.out.println(member1 == member2); // false
        System.out.println(member1.equals(member2)); // false
        System.out.println(member1.hashCode()); // 672320506
        System.out.println(member2.hashCode()); // 718231523

        MyHashSetV2 set = new MyHashSetV2(10);
        set.add(member1);
        set.add(member2);
        System.out.println(set); // MyHashSetV2{buckets=[[], [], [], [MemberNoHashNoEq{id='idA'}], [], [], [MemberNoHashNoEq{id='idA'}], [], [], []], size=2, capacity=10}

        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("idA");
        System.out.println(searchValue.hashCode()); // 2017354584
        boolean result = set.contains(searchValue);
        System.out.println(result); // false
    }
}
