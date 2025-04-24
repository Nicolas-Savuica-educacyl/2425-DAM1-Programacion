public class ProfesorTitular extends Profesor {
    private String fechaAprobacionOposicion;

    public ProfesorTitular(String nombre) {
        super(nombre);
    }

    public ProfesorTitular(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
    }

    public ProfesorTitular(String nombre, int edad, char sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
    }

    public String getFechaAprobacionOposicion() {
        return fechaAprobacionOposicion;
    }

    public void setFechaAprobacionOposicion(String fechaAprobacionOposicion) {
        this.fechaAprobacionOposicion = fechaAprobacionOposicion;
    }
}
