public class ProfesorInterino extends Profesor {
    private String fechaInicioInterinidad;

    public ProfesorInterino(String nombre) {
        super(nombre);
    }

    public ProfesorInterino(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
    }

    public ProfesorInterino(String nombre, int edad, char sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
    }

    public String getFechaInicioInterinidad() {
        return fechaInicioInterinidad;
    }

    public void setFechaInicioInterinidad(String fechaInicioInterinidad) {
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }
}
