package alterg.mod1.performance;

import lombok.Setter;

import java.util.Map;

@Setter
public class OneManBand implements Performer {

    private Map<String, Instrument> instruments;
    private Object someNullProperty = new Object();

    public void perform() throws PerformanceException {
        for (String instrumentKey : instruments.keySet()) {
            System.out.println("Instrument is " + instrumentKey);
            instruments.get(instrumentKey).play();
        }
    }
}
