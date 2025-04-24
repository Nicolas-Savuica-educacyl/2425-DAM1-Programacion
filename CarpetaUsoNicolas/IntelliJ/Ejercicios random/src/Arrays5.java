import java.util.Arrays;
import java.util.Random;

public class Arrays5 {
    public static void main(String[] args) {
        int[] pares = new int[20];
//        int lugar = 0;
        final int TAMANYO = 20;
        int posicion = 0;
        int numeroAComprobar = 0;
//        for (int i = 1; i <= 20; i++) {
//                    pares[lugar] = i * 2;
//                lugar++;
//        }
        while (posicion < TAMANYO) {

            if (numeroAComprobar % 5 == 0 && numeroAComprobar % 7 == 0) {
                pares[posicion] = numeroAComprobar;
                System.out.println((posicion + 1) + ": " + numeroAComprobar);
                posicion++;
            }
            numeroAComprobar++;
        }
        System.out.println("----------------------------------------");
        Random randonico = new Random();
        int[] aleatorio = new int[50];
        int menor = 100;
        int mayor = -1;
        int suma = 0;

        for (int i = 0; i < aleatorio.length ; i++){
            int num = randonico.nextInt(0,100);
            aleatorio[i] = num;
            suma += num;
            if (num < menor) menor = num;
            if (num > mayor) mayor = num;
        }
            int media = suma / aleatorio.length;
        for ( int valor : aleatorio){
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("La media es: " + media);
        System.out.println("----------------------------------------");

        Arrays.sort(aleatorio);

//        for (int Ciclo = 0; Ciclo < aleatorio.length - 1; Ciclo++) {
//            for (int i = 0; i < aleatorio.length - Ciclo - 1; i++) { // lo del -Ciclo es para optimizar, porque cada vez que pasa una vez, el más grade ya está al final
//
//                if (aleatorio[i] > aleatorio[i + 1]) {
//                    int aux = aleatorio[i];
//                    aleatorio[i] = aleatorio[i + 1];
//                    aleatorio[i + 1] = aux;
//                }
//            }
//
        for ( int ciclo = 0; ciclo < aleatorio.length ; ciclo ++){
            for (int posicion2 = 0; posicion2 < aleatorio.length; posicion2++){
                if (aleatorio[ciclo] < aleatorio[posicion2]){
                    int aux = aleatorio[ciclo];
                    aleatorio[ciclo] = aleatorio[posicion2];
                    aleatorio[posicion2] = aux;
                }
            }
        }

        System.out.println("Los numeros ordenados son: ");
        for (int valor : aleatorio) {
            System.out.print(valor + " ");
        }


    }
}
