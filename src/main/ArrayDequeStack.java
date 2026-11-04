package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeStack<E> implements Stack<E> {
    private final Deque<E> deque = new ArrayDeque<>();


    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
