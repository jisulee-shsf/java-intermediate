package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        // 노드 생성 및 연결
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        // toString() 오버라이딩
        System.out.println(first); // 전: Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}
        System.out.println(first); // 후: [A -> B -> C]
    }
}
