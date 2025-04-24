public class NicolasSavuica_ej17 {
    public static void main(String[] args) {
        int numero1 = 420;
        int cifra1 = numero1 / 100;         // Cifra de las centenas
        int cifra2 = (numero1 / 10) % 10;   // Cifra de las decenas
        int cifra3 = numero1 % 10;          // Cifra de las unidades
        System.out.println(cifra1 + " " + cifra2 + " " + cifra3);
    }
}
