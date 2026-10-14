package HashmapAndHashtable;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sara", 1);
        map.put("Fady", 2);
        map.put("Omar", 3);
        System.out.println(map.get("Sara"));
        System.out.println(map.get("Fady"));
        System.out.println(map.get("Omar"));
    }
}
