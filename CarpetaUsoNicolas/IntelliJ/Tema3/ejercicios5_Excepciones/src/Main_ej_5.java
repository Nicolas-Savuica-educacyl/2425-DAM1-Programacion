public class Main_ej_5 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

       try {
           empleado.EstablecerSalario(1000.69);
           System.out.println("El Salario de empleado " +  " :: " + empleado.salario);

           empleado.establecerNombre("Juancho");
           System.out.println("El nombre de empleado "  + " :: " + empleado.nombre);
       } catch (SalarioInvalidoException e) {
           System.out.println("Error, se establécio un salario no digno");
       } catch (NombreInvalidoException e) {
           System.out.println("Bruh, no tiene nombre, pues le pongo un default bobi");
       }
    }
}
