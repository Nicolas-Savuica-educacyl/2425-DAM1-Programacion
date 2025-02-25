import java.util.Scanner;
//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.//
public class NicolasSavuica_ej12 {
    public static void main(String[] args) {
       final float IVA = 0.21f;
        Scanner precio = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        double producto1 = precio.nextDouble();
        System.out.println("El producto con IVA será " + (producto1 + (producto1 * IVA)) + "€");

        precio.close();

    }
}
