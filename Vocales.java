import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe algo: ");
        String texto = scanner.nextLine();

        int vocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' ||
                letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' ||
                letra == 'u' || letra == 'U') {
                vocales++;
            }
        }

        String alReves = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            alReves += texto.charAt(i);
        }

        boolean esPalindromo = true;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != alReves.charAt(i)) {
                esPalindromo = false;
                break;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Al revés: " + alReves);
        System.out.println("Palíndromo: " + esPalindromo);
    }
}
