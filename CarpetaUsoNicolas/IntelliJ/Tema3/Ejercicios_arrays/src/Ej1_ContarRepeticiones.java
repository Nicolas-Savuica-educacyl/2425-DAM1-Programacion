import java.util.Random;
import java.util.Scanner;

public class Ej1_ContarRepeticiones {

    public static void main(String[] args) {
        Random randonico = new Random();
        int[] aleatorio = new int[20];
        for (int i = 0; i < aleatorio.length ; i++) {
            int num = randonico.nextInt(0, 20);
            aleatorio[i] = num;
        }
        Scanner nicoScan = new Scanner(System.in);
        System.out.println("Pon un numero del 0 al 20 y te diremos cuantas vece aparece en el array");
        int numeroElegido = nicoScan.nextInt();
        int contador = 0;
        for (int j : aleatorio) {
            if (j == numeroElegido)
                contador++;
        }
        System.out.println("El array tiene " + contador + " instancias de el numero: " + numeroElegido);

    }
}
