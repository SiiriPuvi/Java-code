import java.util.Scanner;

public class AvarageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int big = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me second number");
        int small = Integer.valueOf(scanner.nextLine());
        System.out.println("Average is: " + (big + small) / 2);


    }
}