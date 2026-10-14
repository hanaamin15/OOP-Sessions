package HandlingExceptions;

public class Main {
    public static void main(String[] args) {
        int number1=60;
        int number2=0;
        System.out.println(number1+number2);


        try{
            System.out.println(number1/number2);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(number1*number2);
    }
}
