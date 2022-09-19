package behavioralpatterns.iterator;

import java.util.LinkedList;

public class List<T> implements AbstractList<T> {
    private final java.util.List<T> elements = new LinkedList<>();

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>();
    }

    @Override
    public boolean addElement(T element) {
        return elements.add(element);
    }

    @Override
    public boolean removeElement(T element) {
        return elements.remove(element);
    }

    private class ListIterator<T> implements Iterator<T>{

        private int index;

        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        @Override
        public T next() {
            if(this.hasNext()){
                return (T) elements.get(index++);
            }
            return null;
        }
    }
}
