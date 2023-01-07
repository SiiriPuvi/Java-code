import java.util.Scanner;

public class SumOfTheSequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me first number ");
        int x =Integer.valueOf(scanner.nextLine());
        System.out.println("Give me second number ");
        int y = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = x; i < y+1; i++){
            sum+=i;
        }
        System.out.println("The sum is : " +sum );
    }
}

