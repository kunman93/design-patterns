package behavioralpatterns.visitor.visitable;

import behavioralpatterns.visitor.visitor.Visitor;

/**
 * Interface for visitable objects.
 */
public interface Visitable{
    void accept(Visitor visitor);
}