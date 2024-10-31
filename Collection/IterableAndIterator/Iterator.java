package Collection.IterableAndIterator;

public interface Iterator <E>{
     abstract boolean hasNext(); //Returns true if the iteration has more elements.
     abstract E next(); //Returns the next element in the iteration.
     void remove();
}
