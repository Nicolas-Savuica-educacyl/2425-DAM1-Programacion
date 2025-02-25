import java.util.Scanner;

//Realiza varios métodos para convertir un numero decimal en binario, octal o hexadecimal.
public class NicolasSavuica_ej7 {
    public static String decimalABinario(int numero) {
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            resultado.insert(0, (numero % 2)); // Aqui he intentado hacer resultado = (numero % 2) + resultado; y le he dado a la advertencia amarilla, pero no se si hemos dado el stringBuilder en este punto
            numero /= 2;
        }
        return resultado.toString();
    }

    public static String decimalAOctal(int numero) {
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            resultado.insert(0, (numero % 8));
            numero /= 8;
        }
        return resultado.toString();
    }

    public static String decimalAHexadecimal(int numero) {
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            int resto = numero % 16;
            if (resto < 10) {
                resultado.insert(0, resto);
            } else {
                // Convertimos los restos 10-15 a A-F
                resultado.insert(0, (char) ('A' + (resto - 10)));
            }
            numero /= 16;
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero = scanner.nextInt();

        // Verificar si el número es 0
        if (numero == 0) {
            System.out.println("Binario: 0");
            System.out.println("Octal: 0");
            System.out.println("Hexadecimal: 0");
        } else {
            String binario = decimalABinario(numero);
            String octal = decimalAOctal(numero);
            String hexadecimal = decimalAHexadecimal(numero);

            System.out.println("Número: " + numero);
            System.out.println("Binario: " + binario);
            System.out.println("Octal: " + octal);
            System.out.println("Hexadecimal: " + hexadecimal);
        }

        scanner.close();
    }
}
