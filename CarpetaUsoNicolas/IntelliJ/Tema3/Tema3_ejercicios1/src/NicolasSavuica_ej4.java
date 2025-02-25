//método inverso(), que recibe un numero y retorna el inverso (si recibe el 1234 da como retorno el 4321). Prohibido usar método reverse().
public class NicolasSavuica_ej4 {
    public static int inverso(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + digito;   // Construir el número invertido
            numero /= 10;
        }

        return numeroInvertido;
    }

    public static void main(String[] args) {
        int numero1 = 123;
        int numero2 = 123456789;
        int numero3 = -12;
        int numero4 = -987654321;

        System.out.println("El número invertido de " + numero1 + " es " + inverso(numero1));
        System.out.println("El número invertido de " + numero2 + " es " + inverso(numero2));
        System.out.println("El número invertido de " + numero3 + " es " + inverso(numero3));
        System.out.println("El número invertido de " + numero4 + " es " + inverso(numero4));
    }
}
