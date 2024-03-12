import java.util.ArrayList;
import java.util.LinkedList;

public class Main3 {
    public static ArrayList<String> toReversedArrayList(LinkedList<String> a){
        ArrayList<String> list = new ArrayList<>();
        int length = a.size();
        for (int i = 0; i < length; i++){
            list.add(a.getLast());
            a.removeLast();
        }

        return list;
    }

    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Alice");
        a.add("Bob");
        a.add("Charlie");

        System.out.println(toReversedArrayList(a).toString());
    }
}
