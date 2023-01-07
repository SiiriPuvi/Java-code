import java.sql.SQLOutput;

public class StringsAndThings {
    public static void main(String[] args) {
        String cars = "Estonia is too cold for me ";
        System.out.println(cars.toUpperCase());
        System.out.println(cars);
        cars = cars.toUpperCase();
        System.out.println(cars);
        System.out.println(cars.length());
        System.out.println(cars.getBytes());
        System.out.println(cars.chars());
        System.out.println(cars.isBlank());


    }
}
