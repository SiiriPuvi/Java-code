import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {


        int n;double res=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Give me a number ");
        n=sc.nextInt();

        int a[]=new int[n];


        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            res =res+a[i];

        System.out.println("Average of the number  is "+res/n);

}}

