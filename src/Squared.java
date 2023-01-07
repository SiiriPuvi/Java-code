import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println(number * number);

        int more = Integer.valueOf(scanner.nextLine());
        System.out.println(more*more);

        int use = Integer.valueOf(scanner.nextLine());
        System.out.println(use*use);

    }
}
