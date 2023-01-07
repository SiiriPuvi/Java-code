import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int First = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me second number");
        int Second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me third number");
        int Third = Integer.valueOf(scanner.nextLine());
        int vastused = First+ Second + Third;

        System.out.println("Sum of numbers is " + vastused);




    }
}