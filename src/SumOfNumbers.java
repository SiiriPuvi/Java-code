import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Give me a number ");
            int input;
            int sum = 0;

            while(true){
                    input = scn.nextInt();
                    if(input == 0){
                            break;
                    }
                    sum += input;
            }

            System.out.print("Sum: " + sum);
}}

