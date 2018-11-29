package com.luomo.study.design.patten.iterator;

import java.util.Iterator;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class LinkedList<E> implements Iterable<E>{

    private Entry<E> header = new Entry<>(null, null, null);
    private int size;

    public LinkedList() {
        header.next = header.previous = header;
    }

    public void add(E e) {
        Entry<E> newEntry = new Entry<>(e, header, header.next);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = size - 1;
        for (Entry<E> e = header.next; e != header; e = e.next) {
            result[i--] = e.value;
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private static class Entry<E> {
        E value;
        Entry<E> previous;
        Entry<E> next;

        public Entry(E value, Entry<E> previous, Entry<E> next) {
            super();
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    private class Itr implements Iterator<E> {

        Entry<E> current = header;

        @Override
        public boolean hasNext() {
            return current.previous != header;
        }

        @Override
        public E next() {
            E e = current.previous.value;
            current = current.previous;
            return e;
        }

        @Override
        public void remove() {

        }

    }

}
