import java.util.Scanner;
//16. Mostrar la tabla de multiplicar de un número. :D//
public class NicolasSavuica_ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.println("su tabla de multiplicar es : " + (numero)  + " " +(numero * 2) +" " + (numero * 3) +" " + (numero * 4) +" " + (numero * 5) +" " + (numero * 6) +" " + (numero * 7) + " " +(numero * 8) + " " +(numero * 9) + " " +(numero * 10));
    }
}
