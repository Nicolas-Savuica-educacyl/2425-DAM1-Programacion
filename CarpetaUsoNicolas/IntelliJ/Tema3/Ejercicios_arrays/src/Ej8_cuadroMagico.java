import java.util.Random;

//Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro mágico aquel en el que las filas, las columnas y las diagonales suman igual.
public class Ej8_cuadroMagico {
    public static void main(String[] args) {


        final int num = 5;
        int[][] nicoarray = new int[num][num];
        Random randonico = new Random();
        int[] sumaFila = new int[num];
        int[] sumaColumna = new int[num];
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;


        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                nicoarray[i][j] = randonico.nextInt(1, 10);
                sumaFila[i] += nicoarray[i][j];
                sumaColumna[j] += nicoarray[i][j];
                if (i == j) {
                    sumaDiagonal1 += nicoarray[i][j];
                }
                if (i + j == num - 1) {
                    sumaDiagonal2 += nicoarray[i][j];
                }
            }

        }
        for (int i = 0; i < nicoarray.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < nicoarray[i].length; j++) {
                System.out.print(nicoarray[i][j] + " | ");
            }
            System.out.println(" = " + sumaFila[i]);
        }
        System.out.println(" ::  ::  ::  ::  ::");
        for (int valor : sumaColumna) {
            System.out.print(" " + valor + " ");
        }

        System.out.println();
        System.out.println("Suma diagonal 1: " + sumaDiagonal1);
        System.out.println("Suma diagonal 2: " + sumaDiagonal2);

        if (sumaColumna[0] == sumaColumna[1] && sumaColumna[1] == sumaColumna[2] && sumaColumna[2] == sumaColumna[3] && sumaColumna[3] == sumaColumna[4] && sumaColumna[4] == sumaFila[0] && sumaFila[0] == sumaFila[1] && sumaFila[1] == sumaFila[2] && sumaFila[2] == sumaFila[3] && sumaFila[3] == sumaFila[4] && sumaFila[4] == sumaDiagonal1 && sumaDiagonal1 == sumaDiagonal2) {
            System.out.println("Es un cuadro mágico, FELICIDADES");
        } else {
            System.out.println("No es un cuadro mágico, noob");
        }
    }
}
