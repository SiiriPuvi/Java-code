import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number ");
        int x =Integer.valueOf(scanner.nextLine());

        int fact=1;

        for (int i = 1; i <= x; i++){
            fact=fact*i;
        }
        System.out.println("Factorial : " + fact );
    }
}
