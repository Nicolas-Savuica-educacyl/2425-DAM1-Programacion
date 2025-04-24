public class NicolasSavuica_ej18 {
    // Escribir un programa en Java que multiplique los 20 primeros números naturales (1*2*3*4*5…).
    public static void main(String[] args) {
        long numeroNatural = 1;

        for (int multiplicador = 1; multiplicador <= 20; multiplicador++ ){
            numeroNatural = numeroNatural * multiplicador;
            System.out.println(numeroNatural);
        }

    }
}
