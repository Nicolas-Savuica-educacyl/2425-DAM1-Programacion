public class Ej10_ArrayComplicado {
    public static void main(String[] args) {
        int[][] nicoArray = new int[5][5];

        // Llenar la nicoArray con el patrón (i + j) % 5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nicoArray[i][j] = (i + j) % 5;
            }
        }

        // Imprimir la nicoArray en el formato solicitado
        for (int[] fila : nicoArray) {
            System.out.print("| ");
            for (int valor : fila) {
                System.out.print(valor + " | ");
            }
            System.out.println();
        }
    }
}
