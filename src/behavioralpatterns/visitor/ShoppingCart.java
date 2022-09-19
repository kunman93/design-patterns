package behavioralpatterns.visitor;

import behavioralpatterns.visitor.visitable.Visitable;
import behavioralpatterns.visitor.visitor.PostageVisitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //normal shopping cart stuff
    private List<Visitable> items = new ArrayList<>();

    public double calculatePostage() {

        if(items == null){
            return 0;
        }

        //create a visitor
        PostageVisitor visitor = new PostageVisitor();

        //iterate through all items
        items.forEach((item) -> item.accept(visitor));
        return visitor.getTotalPostage();
    }

    public void addItem(Visitable item){
        items.add(item);
    }
}