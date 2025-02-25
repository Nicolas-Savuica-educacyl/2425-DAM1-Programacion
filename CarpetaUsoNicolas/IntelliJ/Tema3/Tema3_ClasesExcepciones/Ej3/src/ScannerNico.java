import java.util.Scanner;

public static void main(String[] args) {
    Scanner nicoScan = new Scanner(System.in);
    try {
        System.out.println("introduce un numero");
        int numero = nicoScan.nextInt();
    } catch (Exception e) {
        System.out.println("Error, eres puto");
    } finally {
        nicoScan.close();
        System.out.println("Terminado, gracias por jugar");
    }
}
