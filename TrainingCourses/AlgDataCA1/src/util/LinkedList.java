package util;

/*
* File name : LinkedList
* Author : Thomas Nolan
* Student number : C23775871
* Description of class : LinkedList Class in util Package
*/

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LinkedList<T> implements LinkedListADT<T> {
    private LinearNode<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void add(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);
        if (head == null) {
            head = newNode;
        } else {
            LinearNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public boolean removeIf(Predicate<T> condition) {
        LinearNode<T> current = head;
        LinearNode<T> previous = null;

        while (current != null) {
            if (condition.test(current.getElement())) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public void forEach(Consumer<T> action) {
        LinearNode<T> current = head;
        while (current != null) {
            action.accept(current.getElement());
            current = current.getNext();
        }
    }
}
