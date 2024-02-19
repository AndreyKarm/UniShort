public class Dictionary {
    private DictionaryEntry[] entries;
    private int size;

    public Dictionary() {
        entries = new DictionaryEntry[10000];
        size = 0;
    }

    public void addEntry(String word, String definition) {
        if (size < entries.length) {
            entries[size++] = new DictionaryEntry(word, definition);
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