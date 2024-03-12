import java.util.ArrayList;

class Main1{
    public static void shiftByN(ArrayList<Integer> a, int n) {
        ArrayList<Integer> b = new ArrayList<>();
        n++;
        for(int i = 0; i < a.size(); i++){
            if (i + n < a.size()){
                b.add(a.get(i + n));
            } else {
                b.add(a.get(i + n - a.size()));
            }
        }
        a.clear();
        a.addAll(b);
    }

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        shiftByN(a, 2);

        System.out.println(a.toString());
    }
}