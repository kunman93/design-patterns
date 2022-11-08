package behavioralpatterns.memento.example2;

import behavioralpatterns.memento.example2.caretaker.Editor;

public class Client {

    /*
     * Video Reference: https://youtu.be/_Q5rXfGuyLQ
     */
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Like and");
        editor.printText();
        editor.write("Like and Subscribe");
        editor.printText();
        editor.write("Like and Subscribe to Geekific!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }

}