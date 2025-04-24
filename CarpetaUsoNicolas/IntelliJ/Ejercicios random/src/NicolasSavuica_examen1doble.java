import java.util.Scanner;

public class NicolasSavuica_examen1doble {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        int numero = nicoScan.nextInt();
        nicoScan.close();
        if (numero <= 0)
            System.out.println("Porfavor, utiliza un número mayor de cero");
//        String espacios = " "
//        espacios = espacios.indent(numero)


        for (int numeroActual = 1; numeroActual <= numero * 2 - 1; numeroActual++) {
            int limite = (numeroActual <= numero) ? numeroActual : (numero * 2 - numeroActual);
            int auxNumero = numero;
            int auxNumeroActual = numeroActual;
            for (int numeroImpresoInverso = limite; numeroImpresoInverso >= 1; numeroImpresoInverso--) {
                while (auxNumero > numeroActual) {
                    System.out.print("  ");
                    --auxNumero;
                }
                while (auxNumeroActual > numero) {
                    System.out.print("  ");
                    --auxNumeroActual;
                }
                System.out.print(numeroImpresoInverso + " ");
            }
            for (int numeroImpreso = 2; numeroImpreso <= limite; numeroImpreso++) {
               System.out.print(numeroImpreso + " ");
            }
            System.out.println(" ");
        }
    }
}
