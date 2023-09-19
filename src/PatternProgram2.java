import java.util.Scanner;

public class PatternProgram2 {
    private static void printPattern(int n) {
        int i,j;
        int size=2*n-1;
        for (i=1;i<=size;i++){
            for (j=1;j<=size;j++){
                System.out.print(Math.max(Math.abs(i-n),Math.abs(j-n))+1+"");
            }
System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        System.out.println();
        PatternProgram2.printPattern(n);
    }


}
