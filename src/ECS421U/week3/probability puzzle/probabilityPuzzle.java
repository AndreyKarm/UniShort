import java.util.Random;

public class probabilityPuzzle {
    public static void main(String[] args) {
        int trials = 100000;
        int redSecondPick = 0;
        int greenSecondPick = 0;
        Random r = new Random();

        for (int i = 0; i < trials; i++) {
            int n = r.nextInt(101); // number of red balls
            int redBalls = n;
            int greenBalls = 100 - n;

            // First pick is always red
            redBalls--;

            // Second pick
            if (r.nextInt(redBalls + greenBalls) < redBalls) {
                redSecondPick++;
            } else {
                greenSecondPick++;
            }
        }

        System.out.printf("Red second pick: %d\n", redSecondPick);
        System.out.printf("Green second pick: %d", greenSecondPick);
    }
}