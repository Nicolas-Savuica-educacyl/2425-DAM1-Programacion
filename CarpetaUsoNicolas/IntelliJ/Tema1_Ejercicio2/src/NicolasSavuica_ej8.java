import java.util.Scanner;

public class NicolasSavuica_ej8 {
    //programa que compruebe si un año es bisiesto. :3 //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un año, porfavor");
        int num1 = sc.nextInt();
                                                        //Comprobamos si es divisible entre 100 y luego 400//                   //si no lo es, comprobamos si es divisible entre 4//
        System.out.println("El año introducido es: " + (num1 % 100 == 0 ?  (num1 % 400 == 0 ? "bisiesto" : "no bisiesto") : num1 % 4 == 0 ? "bisiesto " : "no bisiesto" ));
        sc.close();                                                           //              +100 +400)      +100 - 400                     -100 + 4       -100 - 4//
    }
}
