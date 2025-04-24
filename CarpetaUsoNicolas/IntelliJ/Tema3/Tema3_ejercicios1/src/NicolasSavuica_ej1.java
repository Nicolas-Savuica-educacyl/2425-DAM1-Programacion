import java.util.Scanner;

public class NicolasSavuica_ej1 {
//    Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter y retorna un valor true en caso de que el carácter sea una vocal, y un valor false en caso contrario.

    static boolean esVocal(String letra) {
        return switch (letra) {
            case "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        String caracterString;
        boolean repetir = true;
        System.out.println("Pon una letra y te diremos si es vocal");

        // este es un sistema para no tener que cerrar el proigrama si no es solo una letra
        do {
            caracterString = nicoScan.next();
            if (caracterString.length() > 1) {
                System.out.println("Porfavor, solo pon una letra");
            } else {
                repetir = false;
            }
        } while (repetir);
        nicoScan.close();

        System.out.println((esVocal(caracterString)));

    }

}


