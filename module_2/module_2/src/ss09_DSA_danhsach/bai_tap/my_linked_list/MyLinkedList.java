package ss09_DSA_danhsach.bai_tap.my_linked_list;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;


        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {

    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("index: " + index);
        } else {
            Node temp = head;
            Object data;
            if (index == 0) {
                data = temp.data;
                head = head.next;
                numNodes--;
            } else {
                for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                data = temp.next.data;
                temp.next = temp.next.next;
                numNodes--;
            }
            return (E) data;
        }
    }

    public boolean remove(Object e) {
        if (e.equals(head.data)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (e.equals(temp.next.data)) {
                    temp.next = temp.next.next;
                }
                numNodes--;
                return true;
            }
        }
        return true;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new IllegalArgumentException("Not have element");
        }
        MyLinkedList<E> returnList = new MyLinkedList<>();
        Node temp = head;
        returnList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnList.addLast((E) temp.data);
            temp = temp.next;
        }

        return returnList;
    }

    public boolean contains(E o) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = -1;
        for (int i = 0; i < numNodes; i++) {
            if (o.equals(temp.getData())) {
                index = i;
            }
            temp = temp.next;
        }
        return index;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        Node temp = head;
        while (temp.next != null) {
            temp.data = null;
            temp = temp.next;
        }
        numNodes = 0;
    }


}
