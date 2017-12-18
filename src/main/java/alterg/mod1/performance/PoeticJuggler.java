package alterg.mod1.performance;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int bags, Poem poem) {
        super(bags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
