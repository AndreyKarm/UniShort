package ECS421U.week1;

public class Question4 {
    public static void main(String args[]) {
        FSA A, A2 = null;
        String[] alphabet;
        Transition[] delta;
        int[] finals;

        alphabet = new String[] { "0", "1", "2", "3" };
        delta = new Transition[] {
                new Transition(0, "0", 0),
                new Transition(0, "1", 1),
                new Transition(1, "2", 1),
                new Transition(1, "3", 0)
        };
        finals = new int[] { 1 };
        A = new FSA(2, alphabet, delta, finals);
        System.out.println(A);

        // TODO: fill in this code

        // end of TODO part
        System.out.println(A2);
    }
}