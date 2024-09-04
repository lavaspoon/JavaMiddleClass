package collection.linkedlist;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    // [A -> B -> C]
    @Override
    public String toString() {
        //Loop 에서 문자열을 더할려면 StringBuilder 를 쓰는게 좋음
        StringBuilder sb = new StringBuilder();
        Node x= this;

        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append(" -> ");
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
