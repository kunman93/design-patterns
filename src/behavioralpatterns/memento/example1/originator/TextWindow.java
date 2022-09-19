package behavioralpatterns.memento.example1.originator;

import behavioralpatterns.memento.example1.memento.TextWindowMemento;

/**
 * Text window, which holds the currently entered text, and provides a way to add more text
 */
public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public void printText(){
        System.out.println(currentText);
    }

    public TextWindowMemento save() {
        return new TextWindowMemento(currentText.toString());
    }

    public void restore(TextWindowMemento textWindowMemento) {
        if(textWindowMemento != null){
            currentText = new StringBuilder(textWindowMemento.getPreviouslySavedText());
        }
    }
}