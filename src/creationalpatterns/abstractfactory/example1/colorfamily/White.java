package creationalpatterns.abstractfactory.example1.colorfamily;

public class White implements Color{
    @Override
    public ColorDesignation getColorDesignation() {
        return ColorDesignation.WHITE;
    }
}
