import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args)
    {
     printNumbers(20);
    }
    public static void printNumbers(int num)
    {
        if(num >0)
        {
            System.out.print(num +" ");
            printNumbers(num - 1);
        }
    }
}
