import java.util.Scanner;

public class IntegerInputGiveMeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("you gave " + number);
    }
}