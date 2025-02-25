import java.util.Scanner;

public class FuncionAreaTriangulo {
    static double Area (double base, double altura){
        return  (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.println("Pon la base del tríangulo");
        double basetemporal1 = nicoScan.nextDouble();

        System.out.println("Pon la altura del tríangulo");
        double alturatemporal1 = nicoScan.nextDouble();
        nicoScan.close();

        double areaTemporal = Area(basetemporal1, alturatemporal1);
        System.out.println("La area del triangulo es");
        System.out.println(areaTemporal);


    }
}
