import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Give a number: ");
                Scanner reader1 = new Scanner(System.in);
                int numb = reader1.nextInt();

                if(numb % 2 == 0)
                System.out.println("Number " + numb + " is even");
                else
                    System.out.println("Number " + numb + " is odd");
        }
        }