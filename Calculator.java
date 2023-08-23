import java.util.Scanner;

// GOAL MAKAHIMO UG CALCULATOR
public class Calculator {
    public static void main (String[]args){
        // human will input number
        Scanner scanner = new Scanner(System.in);
        // asks human to pick number
        System.out.println("================Good day!================");

        System.out.println("Enter the first number");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double number2 = scanner.nextDouble();

        // asks human to pick what operator to be use
        System.out.println("Enter the operation to be use");
        System.out.println("(+  -  /  *)");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                if (number1 != 0 && number2 !=0) {
                    result = number1 / number2;
                    System.out.println(result);
                }else{
                    System.out.println("Error: Both numbers can't be divided by zero");
                    }
                    break;
            case  '*':
                result = number1 * number2;
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return; // the program will exit
        }
        System.out.println(result);
    }
}
