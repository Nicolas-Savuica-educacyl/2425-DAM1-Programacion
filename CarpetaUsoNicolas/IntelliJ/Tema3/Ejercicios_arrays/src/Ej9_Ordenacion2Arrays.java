import java.util.Random;

public class Ej9_Ordenacion2Arrays {
//Crea un programa que mezcle dos arrays ordenados de N elementos, consiguiendo otro array de N*2 elementos igualmente ordenados.

    public static void main(String[] args) {
        final int num = 3;
        Random randonico = new Random();
        int[] nicoarray = new int[num * 2];

        int[] primerArray = new int[num];
        int[] segundoArray = new int[num];

        for (int i = 0; i < num; i++) {
            primerArray[i] = randonico.nextInt(1, 10);
            segundoArray[i] = randonico.nextInt(1, 10);
        }
        // Ordenamos los arrays
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (primerArray[i] < primerArray[j]) {
                    int aux = primerArray[i];
                    primerArray[i] = primerArray[j];
                    primerArray[j] = aux;
                }
                if (segundoArray[i] < segundoArray[j]) {
                    int aux = segundoArray[i];
                    segundoArray[i] = segundoArray[j];
                    segundoArray[j] = aux;
                }
            }
        }
        for (int valor : primerArray) {
            System.out.print(valor + " ");
        }
        System.out.println(":: Primer array");
        for (int valor : segundoArray) {
            System.out.print(valor + " ");
        }
        System.out.println(":: Segundo array");
        int j = 0;
        for (int i = 0; i < num * 2; i += 2) {
                if (primerArray[j] < segundoArray[j]) {
                    nicoarray[i] = primerArray[j];
                    nicoarray[i + 1] = segundoArray[j];

                } else {
                    nicoarray[i] = segundoArray[j];
                    nicoarray[i + 1] = primerArray[j];
                }
            j++;
        }


        for (int valor : nicoarray) {
            System.out.print(valor + " ");
        }
        System.out.println(":: Array mezclado");

    }
}
