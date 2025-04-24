import java.util.Scanner;

//Crea una clase llamada ValidadorNumero con un método validarPositivo que reciba un número entero. Si el número es negativo, lanza una excepción no comprobada (IllegalArgumentException) con un mensaje adecuado.
public class ValidadorNumero {

    static void validarPositivo(int numero) {
        if (numero < 0) throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        try (nicoScan) {
            System.out.println("Pon un numerito :3");
            int numeroCasual = nicoScan.nextInt();
            validarPositivo(numeroCasual);
            System.out.println("Gracias :3");
        } catch (IllegalArgumentException e) {
            System.out.println("ES UN NUMERO NEGATIVO!!!");
        } finally {
            nicoScan.close();
        }


    }
}
