package util;

/*
* File name : LinearNode
* Author : Thomas Nolan
* Student number : C23775871
* Description of class : LinearNode Class in util Package
*/

public class LinearNode<T> {
    private T element;
    private LinearNode<T> next;

    public LinearNode(T element) {
        this.element = element;
        this.next = null;
    }

    public T getElement() {
        return element;
    }

    public void setNext(LinearNode<T> next) {
        this.next = next;
    }

    public LinearNode<T> getNext() {
        return next;
    }
}
