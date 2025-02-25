import java.util.Scanner;
//programa que calcule cuántos billetes hay que darle a un cliente que quiera sacar cierta cantidad de dinero de su banco. >:c//
public class NicolasSavuica_ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad a retirar: ");
        int dineroRetirado = sc.nextInt();
        sc.close();

        System.out.println("Te van a dar: ");
        System.out.println(dineroRetirado / 500 + " billetes de 500");
        System.out.println(dineroRetirado % 500 / 200 + " billetes de 200");
        System.out.println(dineroRetirado % 500 % 200 / 100 + " billetes de 100");
        System.out.println(dineroRetirado % 500 % 200 % 100 / 50 + " billetes de 50");
        System.out.println(dineroRetirado % 500 % 200 % 100 % 50 / 20 + " billetes de 20");
        System.out.println(dineroRetirado % 500 % 200 % 100 % 50 % 20 / 10 + " billetes de 10");
        System.out.println(dineroRetirado % 500 % 200 % 100 % 50 % 20 % 10 / 5 + " billetes de 5");


    }
}
