package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList); // MyLinkedList{first=[a -> b -> c], size=3}
        String string = stringList.get(0);
        System.out.println("string = " + string); // string = a

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList); // MyLinkedList{first=[1 -> 2 -> 3], size=3}
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer); // integer = 1
    }
}
