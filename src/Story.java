import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What car do you have? ");
        String inSide = scanner.nextLine();
        System.out.println(inSide + " is a good car");
        System.out.println(" ");
        System.out.println("Here is the story");
        System.out.println("I had a Opel, but this dident work" + " So i needed a new working car");
        System.out.println(" I ended at looking " + inSide + " And i love it, it is fast and beautyful :)" );

    }
}
