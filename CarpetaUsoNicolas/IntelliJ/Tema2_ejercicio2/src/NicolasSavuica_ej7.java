import java.util.Scanner;
//Pide por teclado dos números y genera 10 números aleatorios entre esos números.
public class NicolasSavuica_ej7 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        System.out.println("Pon el límite inferior de los numeros aleatorios");
        int limite1 = nicoScan.nextInt();
        System.out.println("Ahora el superior");
        int limite2 = nicoScan.nextInt();
        nicoScan.close();

        for (int bucle = 1; bucle != 21 ; bucle++) {
            int numeroAleatorio = (int) (Math.random() * (limite2 - limite1 + 1)) + limite1;
            System.out.println("El número " + bucle + " es: " + numeroAleatorio);
        }
    }
}