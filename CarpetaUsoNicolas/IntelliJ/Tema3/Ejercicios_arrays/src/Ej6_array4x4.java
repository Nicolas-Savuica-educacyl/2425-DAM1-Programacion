public class Ej6_array4x4 {
    public static void main(String[] args) {
        final int num = 4;

        int[][] nicoarray = new int[num][num];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    nicoarray[i][j] = 1;
                }
            }
        }
        for (int[] fila : nicoarray) {
            System.out.print("| " );
            for (int valor : fila) {
                System.out.print(valor + " | ");
            }
            System.out.println();
        }
    }
}
