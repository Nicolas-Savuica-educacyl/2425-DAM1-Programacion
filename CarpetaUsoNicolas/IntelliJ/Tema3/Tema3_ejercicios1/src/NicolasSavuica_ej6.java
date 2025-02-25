//Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.

import java.util.Scanner;

public class NicolasSavuica_ej6 {
    static String cifrar(String descifrado) {
        StringBuilder cifrado = new StringBuilder();

        for (char letra : descifrado.toCharArray()) {
            if (Character.isLetter(letra)) {
                if (Character.isLowerCase(letra)) letra = (char) ((letra - 'a' + 2) % 26 + 'a');
                else letra = (char) ((letra - 'A' + 2) % 26 + 'A');
            }
            cifrado.append(letra);
        }
        return cifrado.toString();
    }

    // Método para descifrar la cadena
    public static String descifrar(String cifrado) {
        StringBuilder resultado = new StringBuilder();

        for (char letra : cifrado.toCharArray()) {

            if (Character.isLetter(letra)) {
                // Aplicar el desplazamiento circular inverso
                if (Character.isLowerCase(letra)) letra = (char) ((letra - 'a' - 2 + 26) % 26 + 'a');
                else letra = (char) ((letra - 'A' - 2 + 26) % 26 + 'A');
            }
            resultado.append(letra);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.println("Escribe una frase para cifrarla :3");
        String textoOriginal = nicoScan.nextLine();
        String textoCifrado = cifrar(textoOriginal);
        String textoDescifrado = descifrar(textoCifrado);

        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Texto Cifrado: " + textoCifrado);
        System.out.println("Texto Descifrado: " + textoDescifrado);
        nicoScan.close();
    }
}
