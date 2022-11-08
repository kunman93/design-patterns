package structuralpatterns.adapter.example1;

public class BirdAdapter implements ToyDuck{
    private Bird bird;

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
