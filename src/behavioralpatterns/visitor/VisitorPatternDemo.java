package behavioralpatterns.visitor;

import behavioralpatterns.visitor.visitable.Book;
import behavioralpatterns.visitor.visitable.DVD;
import behavioralpatterns.visitor.visitable.Visitable;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Visitable bookWithoutPostage = new Book(50,2);
        Visitable bookWithPostage = new Book(9,2);
        Visitable dvd = new DVD(30);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(bookWithoutPostage);
        shoppingCart.addItem(bookWithPostage);
        shoppingCart.addItem(dvd);

        System.out.println(shoppingCart.calculatePostage());
    }
}
