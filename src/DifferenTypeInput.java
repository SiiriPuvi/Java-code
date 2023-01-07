import java.util.Scanner;

public class DifferenTypeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a string");
        String inSide = scanner.nextLine();

        System.out.println("Give me a Integer");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("Give me Double");
        double numberTwo = scanner.nextDouble();

        System.out.println("Give me a Boolean ");
        boolean bigHouse = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave " + bigHouse);


        System.out.println(" You gave " + inSide);
        System.out.println("you gave " + number);
        System.out.println("you gave " + numberTwo);
        System.out.println("You gave " + bigHouse);


    }
}