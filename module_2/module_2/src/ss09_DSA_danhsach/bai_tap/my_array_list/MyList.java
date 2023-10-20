package ss09_DSA_danhsach.bai_tap.my_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        if (index < size && index >= 0) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return (E) elements;
        } else {
            throw new IllegalArgumentException("index: " + index);
        }
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyList<E> newArray = new MyList<>();
        newArray.elements = Arrays.copyOf(elements, size);
        newArray.size = size;
        return (E) newArray;
    }

    public boolean contains(E o) {
//        boolean check = false;
//        for (int i = 0; i < size; i++) {
//            if (elements[i].equals(o)) {
//                return true;
//            }
//        }
//        return check;
        if (indexOf(o) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (elements.length == size) {
            ensureCapacity(3);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("miniCapacity: " + minCapacity);
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

}
