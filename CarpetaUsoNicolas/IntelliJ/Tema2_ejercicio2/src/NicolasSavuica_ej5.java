import java.util.Scanner;
// triángulo de números
public class NicolasSavuica_ej5 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.println("Introduce la altura del triangulo");
        int alturaTriangulo= nicoScan.nextInt();

        for (int numAuxiliar = 1; numAuxiliar <= alturaTriangulo; numAuxiliar++) {

            for (int numeros = 1; numeros <= numAuxiliar; numeros++) {
                System.out.print(numeros + " ");
            }
            System.out.println();
        }
        nicoScan.close();
    }
}