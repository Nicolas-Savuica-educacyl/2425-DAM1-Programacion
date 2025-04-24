import java.util.Scanner;
//programa en Java que lea un número entero por el teclado e imprima todos los números impares menores que él.
public class NicolasSavuica_ej19 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Ponga un número natural para indicar sus numeros impares" );
        for ( int numeroTeclado = Scanner.nextInt(); numeroTeclado > 0; numeroTeclado-- )  {
            if (numeroTeclado % 2 == 0) continue ;
            System.out.println(numeroTeclado);
        }
        Scanner.close();

    }
}
