import java.util.Scanner;

public class HiAdaLovelace {
    public static void main(String[] args) {
        String New = "Hi " + "Ada Lovelace";
        System.out.println(New);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you salary");
        int desiredSalary = Integer.valueOf(scanner.nextLine());
        int doubledSalary = desiredSalary * 2;
        System.out.println("Your double salary is " + doubledSalary);

        System.out.println("How many days are in week?");
        int daysonWeek = Integer.valueOf(scanner.nextLine());
        int twoweekDays = daysonWeek * 2;
        System.out.println("Two week is " + twoweekDays + " days");

        System.out.println("Give me a number");
        int First = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me second number");
        int Second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me third number");
        int Third = Integer.valueOf(scanner.nextLine());
        System.out.println(First * Second * Third);

        System.out.println("Do i like rainy weather?");
        boolean likesRainyWeather = Boolean.valueOf(scanner.nextLine());
        System.out.println("It is  " + likesRainyWeather + " tahat i like rainy weather");

        System.out.println("Do i  have big house? ");
        boolean bigHouse = Boolean.valueOf(scanner.nextLine());
        System.out.println("It is " + bigHouse + " that i have big house ");













    }
}
