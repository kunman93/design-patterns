package creationalpatterns.abstractfactory.example1.colorfamily;

public class Brown implements Color{
    @Override
    public ColorDesignation getColorDesignation() {
        return ColorDesignation.BROWN;
    }
}
