public class NicolasSavuica_examen2 {
    public static void main(String[] args) {
        int suma = 0;
        int numeroActual = 1000;
        do {
                // como los divisibles por 26 son consecuencialmente divisibles por 13, solo tenemos que dividir por 26
            if ( numeroActual % 26 == 0 ) {
                suma += numeroActual;
            }
            --numeroActual;
        }
        while (numeroActual != 0);
        System.out.println("La suma de todos los números divisibles por 26 ( y 13 ) son: " + suma);


    }
}
