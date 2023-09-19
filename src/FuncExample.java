import java.util.Scanner;
public class FuncExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number1:");
            int number1 = sc.nextInt();
            System.out.println("Enter the number2:");
            int number2 = sc.nextInt();
            System.out.println("press 1 for addition");
            System.out.println("press 2 for subtraction");
            System.out.println("press 3 for multiplication");
            System.out.println("press 4 for division");
            System.out.println("enter your choice:");
            int choice = sc.nextInt();
            int result = 0;
            switch (choice) {
                case 1:
                    result = additiontwoNumbers(number1, number2);
                    break;
                case 2:
                    result = subtractiontwonumbers(number1, number2);
                    break;
                case 3:
                    result = multiplicationtwoNumbers(number1, number2);
                    break;
                case 4:
                    result = divisiontwonumbers(number1, number2);
                    break;
                default:
                    System.out.println("you have entered wrong choice");
                    break;
            }if ((result!=0)) {
                System.out.println("the result is" + result);
            }
        System.out.println("do yo want to continue the program:");
        System.out.print("press [y or n]:");
        String option= sc.next();

        if (option.equals("n") || (option.equals("N")))
            {
break;
        }
         else if (option.equals("y") || (option.equals("Y")))
        {
continue;
            }
            else{
                System.out.println("you have entered the wrong choice");
break;
    }}}
    public static int  additiontwoNumbers(int number1 ,int number2) {
                    return number1 + number2;
                }
    private static int subtractiontwonumbers(int number1, int number2) {

        return number1-number2;
    }
    public static int  multiplicationtwoNumbers(int number1 ,int number2) {
                            return number1 * number2;
                        }
    private static int divisiontwonumbers(int number1, int number2) {
        return number1/number2;
    }
        }