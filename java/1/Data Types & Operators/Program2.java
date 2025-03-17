import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        System.out.println("\nRelational Operations:");
        System.out.println(num1 + " == " + num2 + " -> " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " -> " + (num1 != num2)); 
        System.out.println(num1 + " > " + num2 + " -> " + (num1 > num2));   
        System.out.println(num1 + " < " + num2 + " -> " + (num1 < num2));  
        System.out.println(num1 + " >= " + num2 + " -> " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " -> " + (num1 <= num2)); 

        System.out.println("\nLogical Operations:");
        boolean condition1 = (num1 > 0);
        boolean condition2 = (num2 > 0);

        System.out.println("Both numbers are positive -> " + (condition1 && condition2)); 
        System.out.println("At least one number is positive -> " + (condition1 || condition2)); 
        System.out.println("First number is NOT positive -> " + (!condition1));

        scanner.close();
    }
}

