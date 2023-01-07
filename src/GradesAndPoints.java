import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Give points 0-100: ");

                Scanner reader1 = new Scanner(System.in);
                int numb = reader1.nextInt();

        if (numb < 0 ) {
            System.out.println("Impossible!");}

        else if (numb >=0 && numb < 50) {
            System.out.println("failed");
        }

        else if (numb > 50 && numb < 60) {
            System.out.println("1");
        }

        else if (numb > 60 && numb < 70) {
            System.out.println("2");
        }
        else if (numb > 70 && numb < 80) {
            System.out.println("3");
        }
        else if (numb > 80 && numb  < 90) {
            System.out.println("4");
        }
        else if (numb > 90 && numb < 101) {
            System.out.println("5");
        }
        else {
            System.out.println("Incredible!");}
        }


    }