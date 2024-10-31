package Collection.IterableAndIterator;
//Giao diện Iterable buộc các lớp con
//của nó phải triển khai phương thức trừu tượng 'iterator()'.
public interface Iterable<T> {
   abstract Iterator<T> iterator();//Returns an 'Iterator'(not iterator) over elements of type T.
}
