import java.util.Scanner;

//Método repite(), que recibe como parámetro una cadena de caracteres y un número y retorna un nuevo String donde aparece repetida la cadena de caracteres tantas veces como indique el numero pasado como parámetro.
public class NicolasSavuica_ej5 {
    static void CadenaRepeticion(String cadenaOriginal, int repeticiones) {
        do {
            System.out.println(cadenaOriginal);
            --repeticiones;
        } while (repeticiones > 0);
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        System.out.println("Escribe la frase ");
        String Cadena = nicoScan.nextLine();
        System.out.println("Y ahora las veces que quieras que se repita");
        int repeticiones = nicoScan.nextInt();
        CadenaRepeticion(Cadena, repeticiones);
    }
}
