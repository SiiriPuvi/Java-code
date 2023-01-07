import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SwichStatment {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int numericMonth;
        String month;
        while(true){
            System.out.println("I understand that you want to convert a string month to a numeric month.");
            System.out.println("So...what month is it currently? (Please enter a string.)");
            month = scannerInput.nextLine().toLowerCase();
            switch (month){
                case "january":
                    numericMonth = 1;
                    break;
                case "february":
                    numericMonth = 2;
                    break;
                case "march":
                    numericMonth = 3;
                    break;
                case "april":
                    numericMonth = 4;
                    break;
                case "may":
                    numericMonth = 5;
                    break;
                case "june":
                    numericMonth = 6;
                    break;
                case "july":
                    numericMonth = 7;
                    break;
                case "august":
                    numericMonth = 8;
                    break;
                case "september":
                    numericMonth = 9;
                    break;
                case "october":
                    numericMonth = 10;
                    break;
                case "november":
                    numericMonth = 11;
                    break;
                case "december":
                    numericMonth = 12;
                    break;
                default:
                    numericMonth = -1;
                    break;
            }
            if (numericMonth < 0) System.out.println("Invalid input. Please try again.");
            else{
                month = month.substring(0,1).toLowerCase() + month.substring(1).toLowerCase();
                System.out.println("You entered " + month + ". In numeric form, this is equivalent to " + numericMonth + ". Good job!");
                break;


            }
        }

    }
}
