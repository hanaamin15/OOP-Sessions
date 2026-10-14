package HashmapAndHashtable;

import java.util.Hashtable;

public class Main2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Aya");
        hashtable.put(2, "Bob");
        hashtable.put(3, "Carol");
        hashtable.put(4, "David");
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.get(3));
        System.out.println(hashtable.get(4));
    }
}
