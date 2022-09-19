package behavioralpatterns.visitor.visitor;

import behavioralpatterns.visitor.visitable.Book;
import behavioralpatterns.visitor.visitable.DVD;

/**
 * Visitor interface needed to visit the visitable objects.
 */
public interface Visitor {
    void visit(Book book);

    //visit other concrete items
    void visit(DVD dvd);
}
