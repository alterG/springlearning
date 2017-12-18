package alterg.mod1.idol;

public class Stage {

    private Stage() {
    }

    public Stage getInstance() {
        return StageSingletonHolder.instance;
    }

    private static class StageSingletonHolder {

        static Stage instance = new Stage();
    }
}
