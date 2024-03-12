import java.util.ArrayList;

public class Main2 {
    public static ArrayList<Integer> getOverlap(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < b.size(); j++){
                if(a.get(i) == b.get(j)){
                    list.add(a.get(i));
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(2);

        System.out.println(getOverlap(a, b).toString());
    }
}
