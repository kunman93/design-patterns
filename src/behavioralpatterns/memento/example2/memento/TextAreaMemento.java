package behavioralpatterns.memento.example2.memento;

public class TextAreaMemento {
    private final String text;

    public TextAreaMemento(String textToSave) {
        text = textToSave;
    }

    public String getSavedText() {
        return text;
    }
}
