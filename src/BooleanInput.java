import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do i like rainy weather?");
        boolean likesRainyWeather = Boolean.valueOf(scanner.nextLine());
        System.out.println("It is  " + likesRainyWeather + " tahat i like rainy weather");

        System.out.println("Do i  have big house? ");
        boolean bigHouse = Boolean.valueOf(scanner.nextLine());
        System.out.println("It is " + bigHouse + " that i have big house ");

        boolean isJavaTrue = true;
        boolean isJavaFalse = false;
        System.out.println(isJavaTrue);
        System.out.println(isJavaFalse);
        System.out.println("Do i have a dog?");
        System.out.println(isJavaFalse);



    }
}