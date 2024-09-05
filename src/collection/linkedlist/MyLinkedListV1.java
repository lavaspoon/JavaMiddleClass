package collection.linkedlist;

public class MyLinkedListV1 {

    private Node first;
    private int size;

    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            first = newNode;
        } else {
            //마지막에 추가
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        //마지막까지 찾아야해서 비효율적 O(n)
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object o) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = o;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        //index까지 찾아야해서 비효율적 O(n)
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        //마지막까지 찾아야해서 비효율적 O(n)
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}