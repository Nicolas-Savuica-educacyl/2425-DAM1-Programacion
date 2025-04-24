import java.util.Scanner;

public class NicolasSavuica_ej2 {
    // Realiza un método ImprimirRedondeo() al que se le pasa como parámetro un numero float y los decimales que deben quedar después de ImprimirRedondeo, y retorna el numero redondeado.
    static void ImprimirRedondeo(float numero, int numerosRedondeados) {
        float factor = 1;
        for (int cantidadDeNumeros = 0; cantidadDeNumeros < numerosRedondeados; cantidadDeNumeros++) {
            factor *= 10;
        }

        // Multiplicar y ajustar el número
        float numeroEntero = numero * factor;
        int parteEntera = (int) numeroEntero;

        float parteDecimal = numeroEntero - parteEntera;

        // Incrementar si la parte decimal es 0.5 o mayor
        if (parteDecimal >= 0.5f) {
            parteEntera++;
        }
        System.out.println("El numero redondeado es: " + parteEntera / factor);
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.println("Pon un número con muchos decimales");
        float numScanner = nicoScan.nextFloat();

        System.out.println("Ahora pon los decimales que quieras ImprimirRedondeo");
        int numerosRedondeo = nicoScan.nextInt();
        nicoScan.close();

        ImprimirRedondeo(numScanner, numerosRedondeo);
    }
}
