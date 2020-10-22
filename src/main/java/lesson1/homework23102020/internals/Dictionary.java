package lesson1.homework23102020.internals;

public class Dictionary {

    private final Pair[] pairs;

    public Dictionary(int size) {
        this.pairs = new Pair[size];
    }

    public String get(String key) {
        String value = "";
        for (Pair pair : pairs) {
            if (pair != null && pair.getKey().equals(key)) {
                value = pair.getValue() + "%n";
            }
        }
        if (value == "") {
            value = "Value with key '" + key + "' is not in the dictionary%n----------%n";
        }
        return value;
    }

    public void getPairs() {
        for (Pair pair : pairs) {
            if (pair != null) {
                System.out.printf(pair.getKey() + ": " + pair.getValue() + "%n");
            }
        }
        if(pairs.length > 0) {
            System.out.printf("----------%n");
        }
    }

    public void put(String key, String value) {
        boolean isFull = true;
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] == null) {
                pairs[i] = new Pair(key, value);
                isFull = false;
                break;
            } else if (pairs[i] != null && pairs[i].getKey().equals(key)) {
                System.out.printf("The key '" + key + "' is already taken%n----------%n");
                isFull = false;
                break;
            }
        }
        if (isFull) {
            System.out.printf("Dictionary is full%n----------%n");
        }
    }

    public void set(String key, String value) {
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] != null && pairs[i].getKey().equals(key)) {
                pairs[i] = new Pair(key, value);
                break;
            } else if (pairs[i] != null && !pairs[i].getKey().equals(key)) {
                System.out.printf("The key '" + key + "' is not match%n----------%n");
                break;
            }
        }
    }

    public void delete(String key) {
        boolean isKey = false;
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] != null && pairs[i].getKey().equals(key)) {
                pairs[i] = null;
                isKey = true;
                break;
            }
        }
        if (!isKey) {
            System.out.printf("There is no such key '" + key + "' in the dictionary%n----------%n");
        }
    }

    private static class Pair {
        private final String key;

        private final String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(5);

        dictionary.put("1", "Word1");
        dictionary.put("1", "Word11");
        dictionary.put("2", "Word2");
        dictionary.put("3", "Word3");
        dictionary.put("4", "Word4");
        dictionary.put("5", "Word5");
        dictionary.put("6", "Word6");

        System.out.printf(dictionary.get("1"));
        System.out.printf(dictionary.get("2"));
        System.out.printf(dictionary.get("3"));
        System.out.printf(dictionary.get("4"));
        System.out.printf(dictionary.get("5"));
        System.out.printf(dictionary.get("6"));

        dictionary.delete("1");
        dictionary.delete("1");

        System.out.printf(dictionary.get("1"));

        dictionary.getPairs();

        dictionary.set("2", "Word22");
        dictionary.set("21", "Word22");
        System.out.printf(dictionary.get("2"));

    }
}
