import java.util.Scanner;

public class EjercicioFunciones {

    static String FuncionStringEnMayusculas (String minusculas ) {
      return minusculas.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        System.out.println("Pon un texto y lo pasará a mayúsculas");
        System.out.println(FuncionStringEnMayusculas(nicoScan.nextLine()));
        nicoScan.close();
    }
}
