public class Main4 {
    public static boolean areEqual(String s1, String s2) {
        return s1.equals(s2);
    }

    public static boolean areEqual(Integer i1, Integer i2) {
        return i1.equals(i2);
    }

    public static boolean areEqual(Boolean b1, Boolean b2) {
        return b1.equals(b2);
    }

    public static <T> boolean areEqual(T obj1, T obj2) {
        return areEqual(obj1, obj2);
    }

    public static void main(String[] args) {
        System.out.println(areEqual("test", "test")); // should print true
        System.out.println(areEqual(1, 1)); // should print true
        System.out.println(areEqual(true, false)); // should print false
        System.out.println(areEqual("test", "TEST")); // should print false
    }
}