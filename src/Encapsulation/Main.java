package Encapsulation;

public class Main {
    public void main(String[] args) {
        Cars2 car1 = new Cars2();
        car1.setspeed(100);
        System.out.println(car1.getspeed());
        car1.setcolor("blue");
        System.out.println(car1.getcolor());
        car1.setmodel("BMW");
        System.out.println(car1.getmodel());
    }
}
