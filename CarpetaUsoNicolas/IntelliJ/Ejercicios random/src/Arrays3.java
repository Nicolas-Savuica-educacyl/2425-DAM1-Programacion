import java.util.Random;
import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Escribe un número");
        int[] arrayEscrito = new int[nicoScan.nextInt() + 1];

        nicoScan.close();

        for (int i = 0; i < arrayEscrito.length; i++){
            arrayEscrito[i] = aleatorio.nextInt(1, 100);
            System.out.println("El numero " + i + " :: " + arrayEscrito[i]);
        }
    }
}
