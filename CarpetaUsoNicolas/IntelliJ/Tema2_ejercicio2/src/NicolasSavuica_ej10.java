import java.util.Scanner;
//10.Igual que el anterior, pero el valor de N se leerá por teclado.
public class NicolasSavuica_ej10 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que quieres");
        int cantidadNumeros = nicoScan.nextInt();
        long numeroAnterior = 0;
        long numeroActual = 1;

            for (int i = 1; i <= cantidadNumeros; ++i) {
                System.out.print(numeroAnterior + ", ");

                // Calcula el siguiente término
                long siguienteTermino = numeroAnterior + numeroActual;
                numeroAnterior = numeroActual;
                numeroActual = siguienteTermino;
            }
        nicoScan.close();
        }
    }
