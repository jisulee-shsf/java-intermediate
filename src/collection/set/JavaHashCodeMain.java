package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals() & hashCode() 오버라이딩 O
        System.out.println(member1 == member2); // false
        System.out.println(member1.equals(member2)); // true
        System.out.println(member1.hashCode()); // 104101
        System.out.println(member2.hashCode()); // 104101

        // hashCode() 오버라이딩 X
        System.out.println(member1.hashCode()); // 672320506
        System.out.println(member2.hashCode()); // 718231523
    }
}
