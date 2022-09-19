package behavioralpatterns.visitor.visitable;

import behavioralpatterns.visitor.visitor.Visitor;

public class Book implements Visitable{
    private final double price;
    private final double weight;

    public Book(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}
