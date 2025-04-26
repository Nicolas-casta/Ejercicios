import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese otro número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        if (operacion == '+') resultado = num1 + num2;
        else if (operacion == '-') resultado = num1 - num2;
        else if (operacion == '*') resultado = num1 * num2;
        else if (operacion == '/') {
            if (num2 == 0) {
                System.out.println("No se puede dividir por cero.");
                return;
            }
            resultado = num1 / num2;
        } else {
            System.out.println("Operación no válida.");
            return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
