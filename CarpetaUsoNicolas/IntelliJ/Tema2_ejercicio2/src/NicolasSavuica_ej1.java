import java.util.Scanner;
//programa que te pida la altura de un triángulo rectángulo y lo muestre con asteriscos.
public class NicolasSavuica_ej1 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.println("Introduce la altura del triangulo");
            int alturaTriangulo= nicoScan.nextInt();

            for (int numAuxiliar = 1; numAuxiliar <= alturaTriangulo; numAuxiliar++) {

                for (int asteriscos = 1; asteriscos <= numAuxiliar; asteriscos++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        nicoScan.close();
    }
}
