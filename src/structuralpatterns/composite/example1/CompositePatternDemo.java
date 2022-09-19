package structuralpatterns.composite.example1;

/**
 * Eine Menge von Objekten haben dasselbe Interface und müssen für viele Verantwortlichkeiten als Gesamtheit
 * betrachtet werden. → Composite implementiert dasselbe Interface und leitet Methoden an die darin
 * enthaltenen Objekten weiter.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Picture picture = new Picture();
        Graphic line = new Line();
        Graphic rectangle = new Rectangle();
        Graphic text = new Text();

        picture.addGraphic(line);
        picture.addGraphic(rectangle);
        picture.addGraphic(text);

        picture.draw();

        System.out.println();

        picture.removeGraphic(text);

        picture.draw();
    }
}
