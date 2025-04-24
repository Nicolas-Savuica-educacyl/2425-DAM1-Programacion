public class ClaseBombilla {
    int consumo;
    int lumenes;
    String color;
    boolean estado;

    public ClaseBombilla(int consumo, int lumenes, String color, boolean estado) {
        this.consumo = consumo;
        this.lumenes = lumenes;
        this.color = color;
        this.estado = estado;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getLumenes() {
        return lumenes;
    }

    public String getColor() {
        return color;
    }

    public void encendida() {
        estado = true;

    }

    public void apagada() {
        estado = false;
    }

    public boolean estaEncendida() {
        return estado;
    }


}
