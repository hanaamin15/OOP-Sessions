package Collections;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(5);
        set.add(1);
        set.add(2);
        set.add(3);
        for(Integer i : set){
            System.out.println(i);
        }

       Set<String> set2 = new HashSet<>(5);
        set2.add("Ahmed");
        set2.add("Hana");
        for(String s : set2){
            System.out.println(s);
        }
    }
}
