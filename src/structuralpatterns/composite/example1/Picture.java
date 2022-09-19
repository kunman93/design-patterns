package structuralpatterns.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Composite {

    List<Graphic> graphics = new ArrayList<>();

    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }

    public void addGraphic(Graphic graphic){
        graphics.add(graphic);
    }

    public void removeGraphic(Graphic graphic){
        graphics.remove(graphic);
    }

    public int getChild(){
        return graphics.size();
    }
}
