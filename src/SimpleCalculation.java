import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int big = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me second number");
        int small = Integer.valueOf(scanner.nextLine());
        int vastus = big + small;
        int vastused = big * small;
        int uus = big / small;
        int vana = big - small;

        System.out.println(big + " + " + small + " = " + vastus);
        System.out.println(big + " * " + small + " = " + vastused);
        System.out.println(big + " / " + small + " = " + uus);
        System.out.println(big + " - " + small + " = " + vana);


    }
}