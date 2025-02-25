import java.util.Random;

public class Ej5_NumFaltantes {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        boolean[] presentes = new boolean[101]; // Usamos 101 índices para 1-100
        Random randoNico = new Random();

        System.out.println("Array generado: ");
        // Generar números aleatorios y marcar presentes
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = randoNico.nextInt(100) + 1; // Números entre 1-100
            presentes[numeros[i]] = true;

            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        int contador = 0;
        for(int i = 1; i <= 100; i++) {
            if(!presentes[i])
                contador++;
        }

        // Crear array de faltantes
        int[] faltantes = new int[contador];
        int posicion = 0;
        for(int i = 1; i <= 100; i++) {
            if(!presentes[i]) {
                faltantes[posicion] = i;
                posicion++;
            }
        }

        System.out.println("Números que faltan (" + faltantes.length + "):");
        for(int i = 0; i < faltantes.length; i++) {
            System.out.print(faltantes[i] + " ");
            if((i + 1) % 20 == 0) System.out.println();
        }
    }
}
