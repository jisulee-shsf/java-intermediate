package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성 및 연결
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        System.out.println(first); // [A -> B -> C]

        // 모든 노드 조회
        printAll(first); // A B C

        // 마지막 노드 조회
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode); // lastNode = [C]

        // 특정 index 노드 조회
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item); // index2Node = C

        // 데이터 추가
        add(first, "D");
        System.out.println(first); // [A -> B -> C -> D]
        add(first, "E");
        System.out.println(first); // [A -> B -> C -> D -> E]
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
