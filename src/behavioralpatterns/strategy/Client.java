package behavioralpatterns.strategy;

import behavioralpatterns.strategy.context.Hund;
import behavioralpatterns.strategy.context.Husky;
import behavioralpatterns.strategy.strategy.laufstrategie.Humpeln;

public class Client {
    public static void main(String[] args) {
        Hund husky = new Husky();
        husky.bellen(); //ganz leises bellen...
        husky.laufen(); //Schnelles laufen

        husky.setLaufVerhalten(new Humpeln());
        husky.laufen(); //Humpeln
    }
}
