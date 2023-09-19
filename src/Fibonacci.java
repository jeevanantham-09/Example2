import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int number1=sc.nextInt();
        System.out.println("Enter the second number:");
        int number2=sc.nextInt();
        System.out.println("Enter the number of count to print");
        int count= sc.nextInt();
        int i;
        for( i=0;i<count;i++)
        {
            int number3=number1+number2;
          System.out.println(number3);
          number1=number2;
          number2=number3;
        }
    }
}
