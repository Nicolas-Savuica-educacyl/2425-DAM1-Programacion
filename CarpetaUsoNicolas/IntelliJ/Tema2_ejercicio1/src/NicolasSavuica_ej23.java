import java.util.Scanner;

public class NicolasSavuica_ej23 {
    // Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.0
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
            int sumaDenumeros = 0;
            int numeroDeCeros = 0;

            do {
                int numeroteclado = nicoScan.nextInt();
                sumaDenumeros += numeroteclado;
                if (numeroteclado == 0) {
                    ++numeroDeCeros;
                    }
            } while (numeroDeCeros < 5);
            nicoScan.close();
        System.out.println("El total de los numeros es :: " + sumaDenumeros);
    }

}
