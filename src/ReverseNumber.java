import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
       System.out.print("enter the number:");
       int number=num.nextInt();
        while(number > 0) {
            int reverse = number % 10;
            number = number / 10;
        System.out.print(reverse);
    }}
}