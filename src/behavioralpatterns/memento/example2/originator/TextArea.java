package behavioralpatterns.memento.example2.originator;


import behavioralpatterns.memento.example2.memento.TextAreaMemento;

public class TextArea {

    private String text;

    public void set(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextAreaMemento takeSnapshot() {
        return new TextAreaMemento(text);
    }

    public void restore(TextAreaMemento textAreaMemento) {
        text = textAreaMemento != null ? textAreaMemento.getSavedText() : null;
    }

}