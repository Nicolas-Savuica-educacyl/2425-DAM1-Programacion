import java.util.Objects;

public class ClasePersona {
    String Nombre;
    private int Edad;
    private String DNI;
    private char Sexo;
    private double Peso;
    private double Altura;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public ClasePersona(String nombre) {
        this.Nombre = nombre;
    }

    public ClasePersona(String nombre, int edad, char sexo) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Sexo = sexo;
    }

    public ClasePersona(String nombre, double altura, int edad, char sexo, double peso) {
        this.Nombre = nombre;
        this.Altura = altura;
        this.Edad = edad;
        this.Sexo = sexo;
        this.Peso = peso;
    }

    public byte calcularIMC ( double peso, double altura){
      double IMC = peso / (altura * altura);
      if (IMC < 20)
          return -1;
      else if (IMC < 26)
          return 0;
      else return 1;
    }
    public boolean esMayorDeEdad (int edad){
        return edad > 18; // el IDE me ha dicho que lo puedo simplificar
    }
    private char comprobarSexo (char sexo) {
        if (sexo != 'H' && sexo != 'M') {
           this.Sexo = 'H';
            return 'H';
        } else {
            return sexo;
        }
    }

    private char calcularLetraDNI (int numeroDNI) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numeroDNI % 23;
        return letras.charAt(resto);
    }

    private String generarDNI () {
        int numeroDNI = (int)Math.round(Math.random () * 99999999);
        char letraDNI = calcularLetraDNI(numeroDNI);
        String DNI = numeroDNI + String.valueOf(letraDNI);
        while (DNI.length() < 9)
            DNI = 0 + DNI;
        return DNI;
    }

    public String toString() {
        return "Nombre: " + Nombre + "\nEdad: " + Edad + " años\nDNI: " + DNI + "\nSexo: " +
                (Sexo == 'M' ? "Mujer" : "Hombre") + "\nPeso: " + Peso + " Kg\nAltura: " + Altura + " m";
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClasePersona that = (ClasePersona) o;
        return Edad == that.Edad && Sexo == that.Sexo && Double.compare(Peso, that.Peso) == 0 && Double.compare(Altura, that.Altura) == 0 && Objects.equals(Nombre, that.Nombre) && Objects.equals(DNI, that.DNI);
    }

    @Override
    public int hashCode() {
        return DNI.hashCode();
    }

}
