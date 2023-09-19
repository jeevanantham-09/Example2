import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=sc.nextInt();
        int NewNumberStorage=number;
        int temp;
        int result=0;
        while (number>0){
            temp=number%10;
            result=result+(temp*temp*temp);
            number=number/10;
        }
        if (NewNumberStorage==result)
            System.out.println("IT is ARMSTRONG NUMBER");
        else {
            System.out.println("IS NOT A ARMSTRONG NUMBER");
        }
    }
}
