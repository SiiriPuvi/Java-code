import java.util.Scanner;

public class RepeatingSumofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in=0;

        while (true){
            System.out.println("Give me a number ");

            int userInput = Integer.valueOf(scanner.nextInt ());

            if (userInput<0){
                break;
            }
            in+=userInput;

        }System.out.println("Tnx, bye!");
        System.out.println("Sum of numbers is : " +in);
    }}
