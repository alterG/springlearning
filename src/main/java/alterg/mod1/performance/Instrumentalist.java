package alterg.mod1.performance;

import lombok.Setter;

@Setter
public class Instrumentalist implements Performer {

    private Instrument instrument;
    private String song;

    public void perform() throws PerformanceException {
        System.out.println("Playing song " + song);
        instrument.play();
    }

}
