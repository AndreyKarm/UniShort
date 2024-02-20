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

        System.out.println(isReachable(c, d)); // true
        System.out.println(isReachable(d, c)); // true
        System.out.println(isReachable(c, f)); // true
        System.out.println(isReachable(b, d)); // true
        System.out.println(isReachable(f, d)); // false
        System.out.println(isReachable(d, a)); // false
    }

    public static boolean isReachable(Node start, Node end) {
        // System.out.println("Checking if " + start.label + " can reach " + end.label);
        // Check if current node has any outgoing nodes, if not then return false
        if (start.outgoing == null) {
            // System.out.println("No outgoing nodes for " + start.label + " so returning false");
            return false;
        }

        // Start checking each outgoing node if it is connected to the given end node
        for (int i = 0; i < start.outgoing.length; i++) {
            // If the outgoing node is null, then cycle is detected and returns false
            if (start.outgoing[i] == null) {
                // System.out.println("Cycle detected, so returning false");
                return false;
            }
            // Create a copy of the node system to avoid modifying the original
            Node outgoingNode = start.outgoing[i];
            // Remove the reference, so doesn't go in a cycle
            start.outgoing[i] = null;
            // Checking if given node can be reached from the outgoing node and etc
            if (outgoingNode.label.equals(end.label) || isReachable(outgoingNode, end)) {
                // Restore the reference and return true
                // System.out.println("Can be reached from " + start.label + " so returning true");
                start.outgoing[i] = outgoingNode;
                return true;
            }
            start.outgoing[i] = outgoingNode;
        }
        // If no outgoing node can reach the end node, then return false
        // System.out.println("Cannot be reached from " + start.label + " so returning false");
        return false;
    }
}

class Node {
    String label;
    Node[] outgoing;

    Node(String label) {
        this.label = label;
        this.outgoing = new Node[0];
    }

    public void linkTo(Node n) {
        if (outgoing == null) {
            outgoing = new Node[1];
            outgoing[0] = n;
            return;
        }

        Node[] newOutgoing = new Node[outgoing.length + 1];
        for (int i = 0; i < outgoing.length; i++) {
            newOutgoing[i] = outgoing[i];
        }
        newOutgoing[outgoing.length] = n;
        outgoing = newOutgoing;
    }
}