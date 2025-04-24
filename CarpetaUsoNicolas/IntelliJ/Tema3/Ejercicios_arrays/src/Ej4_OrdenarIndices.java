public class Ej4_OrdenarIndices {
    public static void main(String[] args) {
        int[] arrayOriginal = {50, 30, 40, 20, 60};
        int[] indices = new int[arrayOriginal.length];

        for(int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        for(int i = 0; i < indices.length - 1; i++) {
            for(int j = 0; j < indices.length - 1 - i; j++) {
                if(arrayOriginal[indices[j]] < arrayOriginal[indices[j + 1]]) {
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }

        System.out.println("Array original:");
        for(int num : arrayOriginal) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Índices ordenados:");
        for(int indice : indices) {
            System.out.print(indice + " ");
        }
    }
}