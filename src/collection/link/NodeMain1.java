package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성 및 연결
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        // 모든 노드 탐색
        Node x = first;
        System.out.println("x = " + x);
        while (x != null) {
            System.out.println("x.item = " + x.item);
            x = x.next;
        }
    }
}
