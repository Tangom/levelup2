package org.levelup.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Protsko D.
 */
public class OneWayList<T> implements List<T> {

    private Element head;       // first element
    private Element tail;       // last element
    private int size;           // count of elements

    private class Element{
        T value;
        Element next;
        Element(T value) {
            this.value = value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Element element = new Element(t);
        if (tail == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
        }
        size++;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        head = tail = null;
    }

    public T get(int index) {
        checkIndex(index);

        Element current = head;
        int currIndex = 0;
        while (currIndex != index) {
            currIndex++;
            current = current.next;
        }
        return current.value;
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {    }

    @Override
    public T remove(int index) {
        checkIndex(index);

        if (size == 1) {
            T value = head.value;
            head = null;
            tail = null;
            size--;
            return value;
        }

        if (index == 0) {
            T value = head.value;
            head = head.next;
            size--;
            return value;
        }

        Element curr = head;
        Element prev = null;
        int currIndex = 0;
        while (currIndex != index) {
            prev = curr;
            curr = curr.next;
            currIndex++;
        }

        prev.next = curr.next;
        size--;
        return curr.value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index cannot be less than zero or " +
                    "more than count of elements. Index = " + index);
        }
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
