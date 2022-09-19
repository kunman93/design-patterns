package behavioralpatterns.iterator;

public interface AbstractList<T> {
    Iterator<T> iterator();
    boolean addElement(T element);
    boolean removeElement(T element);
}