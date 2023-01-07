import java.util.Scanner;

public class SpeedTicket {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Give speed: ");

                int speed = scanner.nextInt();

                if (speed <= 120) {
                    System.out.println("All good, no ticket for you!");
                }
                else {
                    System.out.println("Too fast, you will get a ticket- big one!");
                }

            }

        }