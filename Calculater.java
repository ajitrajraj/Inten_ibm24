import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // System.out.print("Choose an operation (add, subtract, multiply, divide): ");
        System.out.print("Choose an operation (+, -, *, %): ");

        String operation = scanner.next();

        double result = 0;
        boolean validOperation = true;

        switch (operation.toLowerCase()) {
            // case "add":
            case "+":

                result = calculator.add(num1, num2);
                break;
            // case "subtract":
            case "-":

                result = calculator.subtract(num1, num2);
                break;
            // case "multiply":
            case "*":

                result = calculator.multiply(num1, num2);
                break;
            // case "divide":
            case "%":

                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("The result of " + operation + " is: " + result);
        }

        scanner.close();
    }
}
