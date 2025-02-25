import java.util.Random;

public class Arrays4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] nicoArray = new int[2000];

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < nicoArray.length; i++) {
            nicoArray[i] = aleatorio.nextInt(1, 100);
            System.out.print(nicoArray[i] + " ");
        }

        int[] frecuencias = new int[100];

        for (int num : nicoArray) {
            frecuencias[num]++;
        }

        int maxRepeticiones = 0;
        int numeroMasRepetido = 0;

        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxRepeticiones) {
                maxRepeticiones = frecuencias[i];
                numeroMasRepetido = i;
            }
        }

        System.out.println("\nEl valor más repetido es el " + numeroMasRepetido
                + ", que aparece " + maxRepeticiones + " veces.");
    }
}