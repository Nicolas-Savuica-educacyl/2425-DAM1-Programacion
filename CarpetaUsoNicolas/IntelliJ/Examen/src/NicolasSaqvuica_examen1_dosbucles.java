import java.util.Scanner;

public class NicolasSaqvuica_examen1_dosbucles {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        int numero = nicoScan.nextInt();

        if (numero <= 0)
            System.out.println("Porfavor, utiliza un número positivo mayor de cero");

        for (int i = 1; i <= numero * 2 - 1; i++) {
            int limite = (i <= numero) ? i : (numero * 2 - i);
            for (int numeroImpreso = 1; numeroImpreso <= limite; numeroImpreso++) {
                System.out.print(numeroImpreso + " ");

            }
            System.out.println(" ");
        }
    }
}