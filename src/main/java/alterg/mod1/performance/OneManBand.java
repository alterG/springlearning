package alterg.mod1.performance;

import lombok.Setter;

import java.util.Collection;

@Setter
public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
