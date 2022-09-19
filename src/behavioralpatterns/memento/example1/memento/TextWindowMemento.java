package behavioralpatterns.memento.example1.memento;

/**
 * Memento, an object holding the current text of the window
 */
public class TextWindowMemento {

    private final String savedText;

    public TextWindowMemento(String text) {
        this.savedText = text;
    }

    public String getPreviouslySavedText() {
        return savedText;
    }
}