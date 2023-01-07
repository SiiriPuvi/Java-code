import java.util.Scanner;

public class LargerThenOrEqualTo {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Give me a number ");

                int numbers = scanner.nextInt();

                System.out.println("Give me second number");

                int numb = scanner.nextInt();

                if (numbers < numb) {
                System.out.println(numbers + " is smaller then " + numb);
        }
                else if (numbers > numb) {
                    System.out.println(numbers + " is bigger then " + numb);
                }
                if (numbers == numb) {
                    System.out.println(numbers + " is equal " + numb);
        }


    }}