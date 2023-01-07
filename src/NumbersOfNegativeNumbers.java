import java.util.Scanner;

public class NumbersOfNegativeNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numb=0;


            while (true){
            System.out.println("Give me a number ");

            int userInput = Integer.valueOf(scanner.nextInt ());

            if (userInput==0){
                break;
            }
            numb ++;

            }System.out.println("Number of negative number : " + numb);}
}

