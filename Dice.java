//Boo!!

import java.util.Random;

public class Dice {
    private static final Random random = new Random();

    public static int rollDice() {
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }
}