package SessionOne;

public class Main {
    public void main(String[] args) {
        Cars car1 = new Cars();
        car1.color = "red";
        car1.model = "Honda";
        car1.speed = 100;
        car1.isManual = true;
        car1.printInfo();


        Cars car2 = new Cars();
        car2.color = "blue";
        car2.model = "Mercedes";
        car2.speed = 200;
        car2.isManual = false;
        car2.printInfo();



        Cars car3 = new Cars();
        car3.color = "green";
        car3.model = "BMW";
        car3.speed = 300;
        car3.isManual = false;
        car3.printInfo();
    }
}
