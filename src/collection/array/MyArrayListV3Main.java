package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list); // [a, b, c] size=3 capacity=5

        // 원하는 위치에 추가
        list.add(3, "addLast"); // O(1)
        System.out.println(list); // [a, b, c, addLast] size=4 capacity=5

        list.add(0, "addFirst"); // O(n)
        System.out.println(list); // [addFirst, a, b, c, addLast] size=5 capacity=5

        // 삭제
        Object removed1 = list.remove(4); // O(1)
        System.out.println("removed(4) = " + removed1); // removed(4) = addLast
        System.out.println(list); // [addFirst, a, b, c] size=4 capacity=5

        Object removed2 = list.remove(0); // O(n)
        System.out.println("removed(0) = " + removed2); // removed(0) = addFirst
        System.out.println(list); // [a, b, c] size=3 capacity=5
    }
}
