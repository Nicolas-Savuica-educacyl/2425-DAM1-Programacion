public class Empleado extends Persona{
    double salario;
    public void EstablecerSalario(double salario)throws SalarioInvalidoException{
        if (salario < 0)
            throw new SalarioInvalidoException("Que pasa, debe dinero por trabajar? venga, dale un salario de verdad");
        this.salario = salario;
    }

    @Override
    public void establecerNombre(String nombre) throws NombreInvalidoException {
      if (nombre.isBlank()){
          super.establecerNombre("Nombre Generico");
      }else
        super.establecerNombre(nombre);
    }
}
