import java.util.Scanner;

public class basicArithOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        double difference = num1 - num2;
        System.out.println("The difference is: " + difference);

        double product = num1 * num2;
        System.out.println("The product is: " + product);

        double quotient = num1 / num2;
        System.out.println("The quotient is: " + quotient);

        double modulus = num1 % num2;
        System.out.println("The modulus is: " + modulus);

        double average = sum / 2;
        System.out.println("The average is: " + average);
    }
}
