import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Give a number:  ");

                int numbers = scanner.nextInt();

                if (numbers <= 0) {
                    System.out.println("The number is not positive");
                }
                else {
                    System.out.println("The number is positive");
                }

            }

        }