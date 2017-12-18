package alterg.mod1.idol;

public class Sonnet29 implements Poem {

    private String lines[] = {
        "Когда в раздоре с миром и судьбой,",
        "Припомнив годы, полные невзгод,",
        "Тревожу я бесплодною мольбой",
        "Глухой и равнодушный небосвод",
        "И, жалуясь на горестный удел,",
        "Готов меняться жребием своим",
        "С тем, кто в искусстве больше преуспел,",
        "Богат надеждой и людьми любим, -",
        "Тогда, внезапно вспомнив о тебе,",
        "Я малодушье жалкое кляну,",
        "И жаворонком, вопреки судьбе,",
        "Моя душа несется в вышину.",
        "С твоей любовью, с памятью о ней",
        "Всех королей на свете я сильней."};


    @Override
    public void recite() {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
