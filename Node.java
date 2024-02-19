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