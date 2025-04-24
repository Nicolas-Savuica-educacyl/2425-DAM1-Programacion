
public abstract class Profesor extends ClasePersona {

    String modulo1;
    int horasSemanalesModulo1;
    String modulo2;
    int horasSemanalesModulo2;

    // Constructores (igual que antes)
    public Profesor(String nombre) {
        super(nombre);
    }

    public Profesor(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
    }

    public Profesor(String nombre, int edad, char sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
    }



    public String modulos () {
            return "Estos son los módulos y las horas semanales de cada módulo que imparte " + getNombre() + ": \nModulo 1: " + modulo1 +
                    "\n" + horasSemanalesModulo1 + " horas \nModulo 2: " + modulo2 + "\n" + horasSemanalesModulo2 + " horas";
    }

    public String horasTotalesSemanales () {
        return horasSemanalesModulo1 + horasSemanalesModulo2 + " horas semanales";
    }

    public void eliminarModulo(byte modulo) {
        if (modulo == 1) {
            modulo1 = "Vacio";
            horasSemanalesModulo1 = 0;
        } else if (modulo == 2) {
            modulo2 = "Vacio";
            horasSemanalesModulo2 = 0;
        }
    }

    public String getModulo1() {
        return modulo1;
    }

    public void setModulo1(String modulo1) {
        this.modulo1 = modulo1;
    }

    public double getHorasSemanalesModulo1() {
        return horasSemanalesModulo1;
    }

    public void setHorasSemanalesModulo1(int horasSemanalesModulo1) {
        this.horasSemanalesModulo1 = horasSemanalesModulo1;
    }

    public String getModulo2() {
        return modulo2;
    }

    public void setModulo2(String modulo2) {
        this.modulo2 = modulo2;
    }

    public double getHorasSemanalesModulo2() {
        return horasSemanalesModulo2;
    }

    public void setHorasSemanalesModulo2(int horasSemanalesModulo2) {
        this.horasSemanalesModulo2 = horasSemanalesModulo2;
    }
}
