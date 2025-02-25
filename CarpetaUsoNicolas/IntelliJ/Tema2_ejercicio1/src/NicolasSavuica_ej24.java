import java.util.Scanner;

public class NicolasSavuica_ej24 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        System.out.println("Pon un número que sea entre 0 y 9999");

        int numeroCapicua = nicoScan.nextInt();

        if (numeroCapicua < 0 || numeroCapicua > 9999) {
            System.out.println("El número debe estar entre 0 y 9,999, entiende porfas.");
        } else if (numeroCapicua == 0 ) {
            System.out.println("El número no es Capicua");
        } else if (numeroCapicua < 10 ) {
            System.out.println("El número es capicua");

        } else if (numeroCapicua < 100 && numeroCapicua >= 10) {
                int ultNum = numeroCapicua % 10;
                int primNum = numeroCapicua / 10;

                if (ultNum == primNum)
                     System.out.println("El numero es capicua");
                 else System.out.println("El numero no es capicua") ;

            } else if (numeroCapicua < 1000 && numeroCapicua >= 100) {

                int ultNum2 = numeroCapicua % 10;
                int primNum2 = numeroCapicua / 100;

                if (ultNum2 == primNum2)
                    System.out.println("El numero es capicua");
                else System.out.println("El numero no es capicua") ;

            } else if (numeroCapicua < 10000 && numeroCapicua >= 1000) {

            int cuartoNumero = numeroCapicua % 10;
            int tercerNumero = numeroCapicua % 100;
            int SegundoNumero = numeroCapicua / 100;
            int PrimerNumero = numeroCapicua / 1000;

            if (cuartoNumero == PrimerNumero && tercerNumero == SegundoNumero)
                System.out.println("El numero es capicua");
            else
                System.out.println("El numero no es capicua") ;

        }
    }

}
