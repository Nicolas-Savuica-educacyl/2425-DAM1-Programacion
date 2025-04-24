import java.util.Scanner;

public class NicolasSavuica_ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de Km/h: ");
        int numero1 = sc.nextInt();
        System.out.println(numero1 + "Km/h es: " + numero1 / 3.6 + "m/s");
    }
}
