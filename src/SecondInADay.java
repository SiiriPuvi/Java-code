import java.util.Scanner;

public class SecondInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days you would like to convert to ours?");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println( 24 * number);

        System.out.println("How many days you would like to convert to second?");
        int daysNumber = Integer.valueOf(scanner.nextLine());
        System.out.println( 24 * 60 * 60 *  daysNumber);


    }
}