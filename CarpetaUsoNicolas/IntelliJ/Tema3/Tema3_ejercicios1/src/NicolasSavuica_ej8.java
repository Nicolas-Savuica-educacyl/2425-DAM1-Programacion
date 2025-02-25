import java.util.Scanner;

//Haz un programa que ordene alfabéticamente las letras de una frase. El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
public class NicolasSavuica_ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String fraseOrdenada = ordenar(frase);
        System.out.println("Frase ordenada: " + fraseOrdenada);

        scanner.close();
    }

    public static String ordenar(String frase) {
        StringBuilder resultado = new StringBuilder();

        while (!frase.isEmpty()) {
            char letraMenor = obtenerLetraMenor(frase);
            resultado.append(letraMenor);
            frase = eliminarLetra(frase, letraMenor);
        }

        return resultado.toString();
    }

    public static char obtenerLetraMenor(String frase) {
        char letraMenor = frase.charAt(0);

        for (char letra : frase.toCharArray()) {
            if (letra < letraMenor) {
                letraMenor = letra;
            }
        }

        return letraMenor;
    }

    public static String eliminarLetra(String frase, char letra) {
        return frase.replaceFirst(String.valueOf(letra), ""); // Reemplazar la primera aparición de la letra con vacío
    }
}
