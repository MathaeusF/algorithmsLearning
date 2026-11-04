package main;

import java.util.NoSuchElementException;

public class BoundedArrayStack<E> implements Stack<E> {
    private final Object[] elements;

    private int numberOfElements;

    public BoundedArrayStack(int capazity){
        if(capazity<1)
            throw new IllegalArgumentException("Capacity muss 1 oder größer 1 sein" +".");
        elements = new Object[capazity];
    }



    @Override
    public void push(E element) {
        if(numberOfElements == elements.length)
            throw new IllegalStateException("Stack is full");
        elements[numberOfElements] = element;
        numberOfElements ++;
    }

    @Override
    public E pop() {
        E element = elementAtTop();
        elements[numberOfElements -1] = null;
        numberOfElements --;
        return element;
    }

    @Override
    public E peek() {
        return elementAtTop();
    }

    private E elementAtTop(){
        if(isEmpty())
            throw new NoSuchElementException();
        @SuppressWarnings("unchecked")
        E element = (E) elements[numberOfElements -1];
        return element;

    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }
}
