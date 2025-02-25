import java.util.Random;

public class Ej2_EstaOrdenado {
    public static String estaOrdenado(int[] array) {
        if (array.length <= 1) {
            return "Está ordenado";
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return "No está organizado";
            }
        }
        return "Está organizado de menor a mayor";
    }

    public static void main(String[] args) {
        Random randonico = new Random();
        int[] aleatorio = new int[5];

        int[] Prueba1 = {1, 2, 3, 4, 5};
        int[] Prueba2 = {1, 3, 2, 4, 5};
        System.out.print("El array aleatorio se conforma de: ");
        for (int i = 0; i < aleatorio.length ; i++) {
            int num = randonico.nextInt(0, 10);
            aleatorio[i] = num;
            System.out.print(aleatorio[i] + " ");
        }
        System.out.println();


        System.out.println("Arreglo 1: " + estaOrdenado(Prueba1));
        System.out.println("Arreglo 2: " + estaOrdenado(Prueba2));
        System.out.println("Array aleatorio: " + estaOrdenado(aleatorio));

    }

}
