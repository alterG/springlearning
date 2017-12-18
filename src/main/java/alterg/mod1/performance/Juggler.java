package alterg.mod1.performance;

public class Juggler implements Performer {

    private int bags = 3;

    public Juggler() {
    }

    public Juggler(int bags) {

        this.bags = bags;
    }

    public void perform() throws PerformanceException {
        System.out.println("Juggling with " + bags + " bags");
    }
}
