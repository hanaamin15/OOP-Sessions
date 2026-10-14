package Collections;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0,12);
        list.add(1,6);
        list.add(2,3);
        list.add(3,10);
        for(Integer i : list){
            System.out.println(i);
        }
        System.out.println(list.get(1));


        List<String> list2 = new ArrayList<>();
        list2.add(0,"Fady");
        list2.add(1,"Rana");
        for(String s : list2){
            System.out.println(s);
        }
        System.out.println(list2.get(1));
    }
}
