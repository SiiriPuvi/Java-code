import java.util.Scanner;

public class FromWhereToWhereSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        System.out.println("Where from? ");

        int number = Integer.valueOf(scanner.nextLine());
        int more = Integer.valueOf(scanner.nextLine());

        if (number<more)
            System.out.println(" ");


        for (int i = more; i <= number ; i++) {
            System.out.println(i);

    }
}}
