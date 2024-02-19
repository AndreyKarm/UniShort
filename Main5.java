public class Main5 {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");

        a.linkTo(b);
        b.linkTo(c);
        c.linkTo(e);
        e.linkTo(f);
        e.linkTo(d);
        d.linkTo(b);

        System.out.println(isReachable(a, e)); // true
        System.out.println(isReachable(f, a)); // false

        // MORE TESTS HERE

        System.out.println(isReachable(b, d)); // true
        System.out.println(isReachable(d, a)); // false
        System.out.println(isReachable(c, d)); // true
        System.out.println(isReachable(f, d)); // false
        System.out.println(isReachable(d, c)); // true
        System.out.println(isReachable(c, f)); // true
    }

    public static boolean isReachable(Node start, Node end) {
        if (start == end) {
            return true;
        }

        for (int i = 0; i < start.outgoing.length; i++) {
            Node oldNodes = start.outgoing[i];

            if (start.outgoing[i] == end) {
                return true;
            }
            if (isReachable(start.outgoing[i], end)) {
                return true;
            }
        }
        return false;
    }
}
