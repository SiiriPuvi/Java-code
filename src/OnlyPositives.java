import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while  (true){
            System.out.println("Give me number ");
            int pos = scanner.nextInt();

            if (pos <= -1){
                System.out.println("Unsuitable number");}
            else if (pos >=0){
                System.out.println(pos * pos);
            }
                    else if (pos == 0){
                        break;

                    }
                }

            }}
