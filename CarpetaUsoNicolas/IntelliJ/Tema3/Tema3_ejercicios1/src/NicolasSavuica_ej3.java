import java.util.Scanner;

//Método factorial(), que calculará el factorial del número que se le pasa como parámetro. Retornará el resultado del cálculo del factorial, o bien un -1 en caso de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro pasado sea cero.
public class NicolasSavuica_ej3 {
    public static long factorial(int numero) {
        // Verificar si el parámetro es negativo
        if (numero < 0) {
            return -1;
        }
        // Verificar si el parámetro es cero
        else if (numero == 0) {
            return -2;
        } else {
            long resultado = 1;
            for (int pasoFactorial = 1; pasoFactorial <= numero; pasoFactorial++) {
                resultado *= pasoFactorial;
            }
            return resultado;
        }
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        System.out.println("Introduce un número y te haremos el factorial");
        int numero = nicoScan.nextInt();
        System.out.println(numero + "! :: " + factorial(numero));
    }
}
