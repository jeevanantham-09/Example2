import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String name=sc.next();
        int n=name.length();
        String r="";
        for(int i=n-1;i>=0;i--) {
            r = r + name.charAt(i);
            System.out.println(r);
        }
        if(name.equals(r))
            System.out.println("It is palindrome");
        else {
            System.out.println("Is not a palindrome");
        }
        }

}
