import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());


        for (int i = 1; i <= number ; i++) {
            System.out.println(i);

            sum += i;
            {
            System.out.println("sum of number is : " +sum);}

    }
}}
