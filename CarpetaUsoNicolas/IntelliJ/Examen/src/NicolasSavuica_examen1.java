import java.util.Scanner;
// no está terminado
public class NicolasSavuica_examen1 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        int numero = nicoScan.nextInt();

        // Parte ascendente del triángulo
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        // Parte descendente del triángulo
        for (int i = numero - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}