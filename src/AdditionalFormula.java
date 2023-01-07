import java.util.Scanner;

public class AdditionalFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int big = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me second number");
        int small = Integer.valueOf(scanner.nextLine());

        int name = big + small;
        System.out.println(big + " + " + small + " = " + name);


    }
}