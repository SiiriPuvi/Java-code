import java.util.Scanner;

public class PmAm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        System.out.println(convertTo24HourFormat(time));
    }
    private static String convertTo24HourFormat(String timeIn12HourFormat)
    {
        int hour = Integer.parseInt(timeIn12HourFormat.substring(0,2));
        String timeOfDay = timeIn12HourFormat.substring(8,10);

        if (timeOfDay.equals("AM"))
        {
            if (hour == 12)
                hour = 0;
        } else if (timeOfDay.equals("PM"))
        {
            if (hour != 12)
                hour += 12;


        }
        return String.format("%02d%s", hour, timeIn12HourFormat.substring(2,8));
    }
}
