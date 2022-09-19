package behavioralpatterns.visitor.visitor;

import behavioralpatterns.visitor.visitable.Book;
import behavioralpatterns.visitor.visitable.DVD;

/**
 * Visits the visitable objects and computes the postage.
 */
public class PostageVisitor implements Visitor {
    private double totalPostageForCart;
    //collect data about the book
    public void visit(Book book) {
        //assume we have a calculation here related to weight and price
        // free postage for a book over 10
        if(freePostageForBook(book)) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    private boolean freePostageForBook(Book book){
        return book.getPrice() < 10.0;
    }

    //add other visitors here
    public void visit(DVD dvd) {
        totalPostageForCart += dvd.getPrice();
    }

    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}