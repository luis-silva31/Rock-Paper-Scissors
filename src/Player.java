import java.util.Random;

public class Player {

    private String nome;
    public int victoryCount = 0;

    public static Enum<HandType> hand(){
        int hand = new Random().nextInt(HandType.values().length);
        return HandType.values()[hand];
    }
}
