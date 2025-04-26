import java.util.Random;

public class AnalisisArray {
    public static void main(String[] args) {
        int[] datos = generarArray(10, 100);
        System.out.println("Media: " + calcularMedia(datos));
        System.out.println("Máximo: " + encontrarMaximo(datos));
        System.out.println("Mínimo: " + encontrarMinimo(datos));
        System.out.println("Desviación estándar: " + calcularDesviacionEstandar(datos));
    }

    // Crear un array de números aleatorios
    public static int[] generarArray(int cantidad, int maximo) {
        int[] arr = new int[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            arr[i] = random.nextInt(maximo + 1);
        }
        return arr;
    }

    // Calcular el promedio de los números
    public static double calcularMedia(int[] arr) {
        int suma = 0;
        for (int num : arr) suma += num;
        return (double) suma / arr.length;
    }

    // Encontrar el número más grande
    public static int encontrarMaximo(int[] arr) {
        int maximo = arr[0];
        for (int num : arr) if (num > maximo) maximo = num;
        return maximo;
    }

    // Encontrar el número más pequeño
    public static int encontrarMinimo(int[] arr) {
        int minimo = arr[0];
        for (int num : arr) if (num < minimo) minimo = num;
        return minimo;
    }

    // Calcular la desviación estándar
    public static double calcularDesviacionEstandar(int[] arr) {
        double media = calcularMedia(arr);
        double suma = 0;
        for (int num : arr) suma += Math.pow(num - media, 2);
        return Math.sqrt(suma / arr.length);
    }
}
