package HomeWork;

import java.util.Scanner;

public class StandartCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int add;
        int subtract;
        int multiply;
        int divide;
        String operation;

        System.out.println("Hello dear user!!! Please enter first number and press enter.");
        firstNumber = scanner.nextInt();

        System.out.println("Please choose the operation and press enter.");
        System.out.println(" + " + " - " + " * " + " / ");
        operation = scanner.next();

        System.out.println("Please enter second number and press enter.");
        secondNumber = scanner.nextInt();

        add = firstNumber + secondNumber;
        subtract = firstNumber - secondNumber;
        multiply = firstNumber * secondNumber;
        divide = firstNumber / secondNumber;



        if (operation.equals("+")) System.out.println("Result is: " + firstNumber + " + " + secondNumber + " = " + add + " Thank you for choosing us! Bye-Bye!");
        if (operation.equals("-")) System.out.println("Result is: " + firstNumber + " - " + secondNumber + " = " + subtract + " Thank you for choosing us! Bye-Bye!");
        if (operation.equals("*")) System.out.println("Result is: " + firstNumber + " * " + secondNumber + " = " + multiply + " Thank you for choosing us! Bye-Bye!");
        if (operation.equals("/")) System.out.println("Result is: " + firstNumber + " / " + secondNumber + " = " + divide + " Thank you for choosing us! Bye-Bye!");





    }

}
