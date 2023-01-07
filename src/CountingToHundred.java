import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.valueOf(scanner.nextLine());

        for (int o = numb; o <= 100; o++){
            System.out.println( o);
    }
}}
