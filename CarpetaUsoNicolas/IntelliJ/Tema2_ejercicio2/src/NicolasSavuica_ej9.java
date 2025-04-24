//9.Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.
public class NicolasSavuica_ej9 {
    public static void main(String[] args) {
        int cantidadNumeros = 9;
        System.out.println("Van a salir " + cantidadNumeros + " numeros de la serie de fibonacci");
        int numeroAnterior = 0;
        int numeroActual = 1;

        for (int i = 1; i <= cantidadNumeros; ++i) {
            System.out.print(numeroAnterior + ", ");

            // Calcula el siguiente término
            int siguienteTermino = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteTermino;
        }
    }
}
