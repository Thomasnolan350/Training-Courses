package util;

/*
* File name : LinkedListADT
* Author : Thomas Nolan
* Student number : C23775871
* Description of class : LinkedListADT Class in Util Package
*/
 
public interface LinkedListADT<T> {
    void add(T element);
    boolean removeIf(java.util.function.Predicate<T> condition);
    void forEach(java.util.function.Consumer<T> action);
}
