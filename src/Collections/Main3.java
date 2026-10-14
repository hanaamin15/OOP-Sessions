package Collections;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sara");
        arrayList.add("Omar");
        for(String s: arrayList){
            System.out.println(s);
        }
        System.out.println(arrayList.contains("Sara"));
        System.out.println(arrayList.contains("Fady"));
    }
}
