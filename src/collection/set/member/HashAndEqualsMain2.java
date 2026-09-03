package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MemberOnlyHash member1 = new MemberOnlyHash("idA");
        MemberOnlyHash member2 = new MemberOnlyHash("idA");

        System.out.println(member1 == member2); // false
        System.out.println(member1.equals(member2)); // false
        System.out.println(member1.hashCode()); // 104101
        System.out.println(member2.hashCode()); // 104101

        MyHashSetV2 set = new MyHashSetV2(10);
        set.add(member1);
        set.add(member2);
        System.out.println(set); // MyHashSetV2{buckets=[[], [MemberOnlyHash{id='idA'}, MemberOnlyHash{id='idA'}], [], [], [], [], [], [], [], []], size=2, capacity=10}

        MemberOnlyHash searchValue = new MemberOnlyHash("idA");
        System.out.println(searchValue.hashCode()); // 104101
        boolean result = set.contains(searchValue);
        System.out.println(result); // false
    }
}
