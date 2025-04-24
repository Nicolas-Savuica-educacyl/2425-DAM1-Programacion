public class Persona {
    String nombre;
    public void establecerNombre (String nombre) throws NombreInvalidoException{
        if (nombre.isBlank())
            throw new NombreInvalidoException("tienes que poner una edad valida, bro");
        this.nombre = nombre;
    }
}
