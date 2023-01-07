import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a year:  ");

        int number = scanner.nextInt();

        if (number <= 2015) {
            System.out.println("Ancient history");
        }
        if (number >= 2023){
            System.out.println("I will look forward for this");
        }
        else {
            System.out.println(" ");
        }
        }}