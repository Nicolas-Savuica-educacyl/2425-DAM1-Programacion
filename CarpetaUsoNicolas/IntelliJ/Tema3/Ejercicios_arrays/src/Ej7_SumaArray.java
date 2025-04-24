import java.util.Random;

public class Ej7_SumaArray {
    public static void main(String[] args) {
        final int num = 3;
        int[][] nicoarray = new int[num][num];
        Random randonico = new Random();
        int[] sumaFila = new int[num];
        int[] sumaColumna = new int[num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                nicoarray[i][j] = randonico.nextInt(1, 10);
                sumaFila[i] += nicoarray[i][j];
                sumaColumna[j] += nicoarray[i][j];
            }
        }
        for (int i = 0; i < nicoarray.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < nicoarray[i].length; j++) {
                System.out.print(nicoarray[i][j] + " | ");
            }
            System.out.println( " = " + sumaFila[i]);
        }
        System.out.println(" ::  ::  :: ");

        for (int valor : sumaColumna) {
            System.out.print(" " + valor + " ");
        }


    }
}
