public class Estudiante {
    int edad;
    String nombre;
    public void EstablecerEdad(int edad) throws EdadInvalidaException{
        if (edad <= 0 || edad >  150)
            throw new EdadInvalidaException ("Que haces bruh, pon edad válida");
        this.edad = edad;
    }
    public void EstablecerNombre(String nombre) throws NombreInvalidoException {
        if (nombre.isBlank())
            throw new NombreInvalidoException("Que haces bruh, pon nombre valido");
        this.nombre = nombre;
    }

}
