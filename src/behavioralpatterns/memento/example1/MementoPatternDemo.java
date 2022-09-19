package behavioralpatterns.memento.example1;

import behavioralpatterns.memento.example1.caretaker.TextEditor;
import behavioralpatterns.memento.example1.originator.TextWindow;

/**
 * Typically, the Memento Design Pattern will be used in situations where some actions are undoable, therefore requiring
 * to rollback to a previous state. However, if the state of the Originator is heavy, using the Memento Design Pattern
 * can lead to an expensive creation process and increased use of memory.
 *
 * Memento (SolverState)
 * - stores internal state of the Originator object. The memento may store as
 *   much or as little of the originator's internal state as necessary at its originator's discretion.
 *
 * Originator (ConstraintSolver)
 * - creates a memento containing a snapshot of its current internal state.
 * - uses the memento to restore its internal state.
 *
 * Caretaker (undo mechanism)
 * - is responsible for the memento's safekeeping.
 * - never operates on or examines the contents of a memento.
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());

        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");

        textEditor.saveFile();

        textEditor.write("Buy milk and eggs before coming home\n");

        textEditor.undoChanges();

        textEditor.print();
    }
}
