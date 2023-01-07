import java.sql.SQLOutput;

public class CarMain {
    public static void main(String[] args) {
        CarClass mercedes = new CarClass("Mercedes", 15, 100,"red",200);

        System.out.println("My new car is " + mercedes.mark );
        System.out.println("It is already " + mercedes.age + " years old, but it is still going fast :) ");
        System.out.println("It can speed to " + mercedes.speed + " km/h in 3 second");
        System.out.println("Maximum speed that i have got is " + mercedes.power + " km/h ");
        System.out.println("It is " + mercedes.color + " and really beautiful car :) ");

        mercedes.fastCar();
        mercedes.newCar();
        mercedes.moreMoney();


    }
}
