package Collection.DynamicLinkedList;

import Collection.IterableAndIterator.Iterable;

public interface DoublyLinkedList <T> extends Iterable<T> {

    void clear();

    int size();

    boolean isEmpty();

    boolean contains(T t);

    T get(int index);

    T set(int index, T element);

    T remove(int index);

    void add(T element);

    void add(int index, T element);

    void addFirst(T element);

    void addLast(T element);

    T peekFist();

    T peekLast();

    T removeFirst();

    T removeLast();

    T remove(Node<T> node);

    T removeAt(int index);

    int indexOf(Object object);

}
