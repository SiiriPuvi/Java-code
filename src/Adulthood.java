import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("How old are you? ");

                int numbers = scanner.nextInt();

                if (numbers <= 17) {
                    System.out.println("You are not adult");
                }
                else {
                    System.out.println("You are adult");
                }

            }

        }