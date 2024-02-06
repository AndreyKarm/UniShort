public class Dictionary2 {
    private static Dictionary2 instance = null;
    private DictionaryEntry2[] entries;
    private int size;

    private Dictionary2() {
        entries = new DictionaryEntry2[10000];
        size = 0;
    }

    public static Dictionary2 createDictionary2() {
        if (instance == null) {
            instance = new Dictionary2();
        } else {
            System.out.println("This class is a singleton!");
        }
        return instance;
    }

    public void addEntry(String word, String definition) {
        if (size < entries.length) {
            entries[size++] = new DictionaryEntry2(word, definition);
        }
    }

    public String findDefinition(String word) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getWord().equals(word)) {
                return entries[i].getDefinition();
            }
        }
        return "Not Found.";
    }   
}