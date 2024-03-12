import java.util.HashMap;
import java.util.LinkedList;

public class Main4 {
    public static HashMap<String, Integer> getCounts(LinkedList<String> a){
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        for(int i = 0; i < a.size(); i++){
            if(list.get(a.get(i)) == null){
                list.put(a.get(i), 1);
            } else if (list.get(a.get(i)) > 0){
                int j = list.get(a.get(i));
                j++;
                list.put(a.get(i), j);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Java");
        a.add("Python");
        a.add("Java");
        a.add("C++");

        System.out.println(getCounts(a).toString());
    }
}
