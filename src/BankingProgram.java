import java.util.HashMap;
import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        HashMap<String,String> studentData = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int initialdeposit = 0;
        int totalbalance = 0;
        while (true) {
            System.out.println("choose your option to perform");
            System.out.println("1.CREATE AN ACCOUNT");
            System.out.println("2.DEPOSIT CASH");
            System.out.println("3.WITHDRAW CASH");
            System.out.println("4.CHECK BALANCE");
            System.out.println("5.EXIT \n ");
            System.out.print("ENTER HERE:");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("ENTER YOUR ID: ");
                    String studentid = scanner.next();
                    System.out.println("ENTER YOUR NAME:");
                    String studentName = scanner.next();
                    studentData.put(studentid, studentName);
                    System.out.println("Student added successfully.");
                    System.out.println("Initial deposit");
                    initialdeposit = scanner.nextInt();
                    if (initialdeposit < 1000) {
                        System.out.println("your intial deposit should be more the 1000");
                        System.out.println("total balance :"+totalbalance);

                    } else {
                        System.out.println("Your money is deposited sucessfully");
                        totalbalance+=initialdeposit;
                        System.out.println("Balance="+totalbalance);
                    }
                    break;
                case 2:
                    if (totalbalance>1000){
                    System.out.println("CASH DEPOSIT");
                    System.out.print("Enter Your ID: ");
                    String studentId= scanner.next();
                    if (studentData.containsKey(studentId)) {
                        studentName = studentData.get(studentId);
                        System.out.println("Student NAME: " + studentName);
                        System.out.println("ENTER AMOUNT:");
                        int depositamount = scanner.nextInt();
                        totalbalance= initialdeposit+depositamount;
                        System.out.println("CASH DEPOSITED SUCESSFULLY");
                        System.out.println("Total balance=" +totalbalance);
                    } else {
                        System.out.println("Student not found.");
                    }}
                    else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("WIDTHDRAW CASH");
                    System.out.print("Enter Your ID : ");
                    String studentId1= scanner.next();
                    if (studentData.containsKey(studentId1)) {
                        studentName = studentData.get(studentId1);
                        System.out.println("Student NAME: " + studentName);
                    System.out.println("ENTER AMOUNT:");
                    int widthdraw = scanner.nextInt();
                    if (widthdraw<=totalbalance) {
                        System.out.println("CASH WIDTHDRAWN SUCESSFULLY");
                        totalbalance -= widthdraw;
                        System.out.println("TOTAL BALANCE" + totalbalance);
                    }
                    else {
                        System.out.println("Insufficient balance");
                    }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Your ID : ");
                    String studentId2= scanner.next();
                    if (studentData.containsKey(studentId2)) {
                        studentName = studentData.get(studentId2);
                        System.out.println("Student NAME: " + studentName);
                    System.out.println("BALANCE AMOUNT :"+totalbalance);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Function Exited \n Thankyou ");
                    System.exit(selection);
                    break;
            }

        }
    }
}







