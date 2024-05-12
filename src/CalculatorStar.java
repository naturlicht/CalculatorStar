import java.util.Scanner;

public class CalculatorStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        int operand2;
        char operation;

        while(true) {
            operation = scanner.next().charAt(0);

            if (operation == 's') {
                scanner.close();
                System.out.println("End of job. Goodbye.");
                break;
            }

            if (operation == 'C') operand1 = 0;
            else {
                operand2 = scanner.nextInt();
                switch(operation) {
                    case '+':
                        operand1 += operand2;
                        break;
                    case '-':
                        operand1 -= operand2;
                        break;
                    case '*':
                        operand1 *= operand2;
                        break;
                    case '/':
                        operand1 /= operand2;
                        break;
                    default:
                        System.out.println("Incorrect operation: " + String.valueOf(operation));
                        break;
                }
            }
            System.out.println(operand1);
        }
    }
}