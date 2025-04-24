public class Registro {

    public static int registrarEdad(int edadPuesta) throws EdadInvalidaException {
        if (edadPuesta < 0 || edadPuesta > 120) throw new EdadInvalidaException("Edad invalida" + edadPuesta);

        return edadPuesta;
    }


    public static void main(String[] args) {
        try {
            System.out.println(registrarEdad(250));
        } catch (EdadInvalidaException e) {
            System.out.println("La edad no esta permitida, brooooo");
        }

    }
}