import java.util.Scanner;

public class DoubleInputy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 3.2;
        double b = 5.2;

        System.out.println(a);
        System.out.println(a + b);

        System.out.println("Give a number");
        double number = scanner.nextDouble();
        System.out.println("you gave " + number);


    }
}
