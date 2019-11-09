package lesson10;

public class LinkedList<T> {
    private Node head;

    public void add(T value){
        if (head == null) {
            head = new Node<>(value);
            return;
        }
        find(-1).next = new Node<>(value);
    }

    public T get(int ind) {
        Node<T> result = find(ind); // пришел объект\
        return result == null ? null : result.value; // берем значение велью


    }



    private Node find(int ind){
        if (ind == 0) return head;

        int cnt = 0;
        Node node = head;
        while (node != null){
            if (cnt++ == ind) return node;
            if (ind < 0 && node.next == null) return node;
            node = node.next;
        }
        return null;
    }
}


class Node<T>{
    T value;
    Node next;

    public Node(T value) {
        this.value = value;
    }

}