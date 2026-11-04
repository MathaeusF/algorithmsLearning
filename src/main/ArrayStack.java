package main;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    public static final int MAX_SIZE = Integer.MAX_VALUE -8;
    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    private Object[] elements;
    private int numberOfElements;

    public ArrayStack(){
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayStack(int initialCapacity){
        if(initialCapacity<1)
            throw new IllegalArgumentException("Capacity muss größer oder gleich 1 sein");
        elements = new Object[initialCapacity];
    }


    @Override
    public void push(E element) {
        if(elements.length == numberOfElements)
            grow();
        elements[numberOfElements] = element;
        numberOfElements ++;
    }

    private void grow(){
        int newCapacity = calculateNewCapacity(elements.length);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    static int calculateNewCapacity(int currentCapacity){
        if(currentCapacity >= MAX_SIZE)
            throw new IllegalStateException("Kann nicht größer");
        int newCapacity = currentCapacity + calculateIncrement(currentCapacity);

        if(newCapacity > MAX_SIZE || newCapacity < 0)
            newCapacity = MAX_SIZE;

        return newCapacity;
    }

    private static int calculateIncrement(int currentCapacity){
        return Math.max(1, currentCapacity < 64 ? currentCapacity : currentCapacity / 2);
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
