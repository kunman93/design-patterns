package behavioralpatterns.memento.example1.caretaker;

import behavioralpatterns.memento.example1.memento.TextWindowMemento;
import behavioralpatterns.memento.example1.originator.TextWindow;

/**
 * Caretaker
 */
public class TextEditor {

    // Originator
    private final TextWindow textWindow;

    // Memento of the Originator
    private TextWindowMemento textWindowMemento;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text){
        textWindow.addText(text);
    }

    public void print(){
        textWindow.printText();
    }

    // Creating a textWindowMemento, when a file is saved
    public void saveFile() {
        textWindowMemento = textWindow.save();
    }

    // undoing changes on textWindow by loading textWindowMemento
    public void undoChanges() {
        textWindow.restore(textWindowMemento);
    }
}