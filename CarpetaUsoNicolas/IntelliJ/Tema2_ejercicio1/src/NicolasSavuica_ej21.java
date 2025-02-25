import java.util.Scanner;
//Realiza un programa que permita la entrada de varios números y calcule su media.//
public class NicolasSavuica_ej21 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Introduce números, introduce \"true\" para empezar, ");
        double Suma = 0;
        int Contador = 0;


        for (boolean continuar = Scanner.nextBoolean(); continuar  ; Contador++ ) {
            System.out.println("Ahora ponga el numero para hacer la media");
            int NumeroPuesto = Scanner.nextInt();
            Suma += NumeroPuesto;

            System.out.println("Quiere usted continuar? true para si, false para no");
            continuar = Scanner.nextBoolean();
        }
        Scanner.close();
        if (Contador > 0) {
            double media = Suma / Contador;
            System.out.println("La media de los números ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }
}