import java.util.Scanner;

public class RepeatingSumAndNumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in=0;
        int is=0;
        float avr =0;

        while (true){
            System.out.println("Give me a number ");

            int userInput = Integer.valueOf(scanner.nextInt ());

            if (userInput<0){
                break;
            }
            in+=userInput;
            is++;
            avr=(in/is);

        }System.out.println("Tnx, bye!");
        System.out.println("Sum of numbers is : " +in);
        System.out.println("Number of number is :" + is);
        System.out.println("Average : " + avr );
    }}
