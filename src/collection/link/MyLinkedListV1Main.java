package collection.link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println(list); // MyLinkedListV1{first=null, size=0}

        System.out.println("데이터 추가");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list); // MyLinkedListV1{first=[a -> b -> c], size=3}

        System.out.println("기능 사용");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));
        System.out.println(list); // MyLinkedListV1{first=[a -> b -> z], size=3}

        System.out.println("범위 초과");
        list.add("d");
        list.add("e");
        list.add("f"); //
        System.out.println(list); // MyLinkedListV1{first=[a -> b -> z -> d -> e -> f], size=6}
    }
}
