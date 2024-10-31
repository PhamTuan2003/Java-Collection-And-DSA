package Collection.DynamicLinkedList;

import Collection.IterableAndIterator.Iterator;

public class DefaultDoublyLinkedList<T> implements DoublyLinkedList<T>{

    private int size;
    private Node<T> head = null;
    private Node<T> tail = null;

    @Override
    public void clear() {
        Node<T> current = head;
        while (current != null) {
            Node<T> nextNode = current.getNext();
            current.setNext(null);
            current.setPrev(null);
            current.setData(null);
            current = nextNode;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void add(T element) {
        addLast(element);
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public void addFirst(T element) {
        if(isEmpty()){
            head = tail = new Node<>(element, null, null);
        }else{
            Node<T> newNode = new Node<>(element, null, head);
            head.setNext(newNode);
            head = head.getPrev();
        }
    }

    @Override
    public void addLast(T element) {
        if(isEmpty()){
            head = tail = new Node<>(element, null, null);
        }else{
            Node<T> newNode = new Node<>(element, tail, null);
            tail.setNext(newNode);
            tail = tail.getNext();
        }
    }

    @Override
    public T peekFist() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T remove(Node<T> node) {
        return null;
    }

    @Override
    public T removeAt(int index) {
        return null;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
