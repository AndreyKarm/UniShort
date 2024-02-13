public class math {
    public static void main(String[] args) {
        recurringFraction(100000);
    }

    public static void recurringFraction(int searchZone) {
        int longestCycleLength = 0;
        int number = 0;

        for (int i = 2; i < searchZone; i++) {
            int remainder = 1;
            int[] remainders = new int[i];
            int position = 0;
            while (remainders[remainder] == 0 && remainder != 0) {
                remainders[remainder] = position;
                remainder = (remainder * 10) % i;
                position++;
            }

            if (position - remainders[remainder] > longestCycleLength) {
                longestCycleLength = position - remainders[remainder];
                number = i;
            }
        }
        System.out.printf("Longest recurring cycle is: %d, with the number: %d\n", longestCycleLength, number);
    }
}