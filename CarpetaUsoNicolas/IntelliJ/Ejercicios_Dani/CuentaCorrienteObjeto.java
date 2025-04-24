/*
Se desea llevar el control de una cuenta.La cuenta esta caracterizada por su saldo y se pueden realizar
tres tipos de operaciones.
Saldo: devuelve el saldo
Imposición: ingresa la cantidad en la cuenta
Reintegro: saca de la cuenta el dinero.

Escriba una clase con el metodo main que pruebe la funcionalidad
 */


import java.util.Scanner;

public class CuentaCorrienteObjeto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dinero para ingresar");
        int dineroParaIngresar = sc.nextInt();
        System.out.println("Introduce el dinero para sacar");
        int dineroParaSacar = sc.nextInt();

        ClaseCuentaCorriente cuenta = new ClaseCuentaCorriente();

        cuenta.ingresarDinero(dineroParaIngresar);
        System.out.println("Saldo después del ingreso: " + cuenta.saldo());


        cuenta.sacarDinero(dineroParaSacar);
        System.out.println("Saldo después de sacar dinero: " + cuenta.saldo());


    }
}

