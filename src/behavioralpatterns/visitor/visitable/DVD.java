package behavioralpatterns.visitor.visitable;

import behavioralpatterns.visitor.visitor.Visitor;

public class DVD implements Visitable{
    private final double price;

    public DVD(double price){
        this.price = price;
    }

    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
}
