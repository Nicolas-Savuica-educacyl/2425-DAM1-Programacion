public class ValidadorNumero {

    public ValidadorNumero(int numerito) {
        if (numerito < 0) {
            throw new IllegalargumentException("El número es inválido, tiene que ser positivo");
        }
        System.out.println("Su numero está bien");
    }
}
