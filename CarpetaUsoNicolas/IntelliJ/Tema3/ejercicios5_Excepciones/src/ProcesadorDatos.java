import java.util.Scanner;

public class ProcesadorDatos {
    public static void procesarEntrada(){
        Scanner nicoScan = new Scanner(System.in);
           try {
            System.out.println("Pon un numero que quieras :3");
            String lineaScan = nicoScan.nextLine();

            double numerolinea = Double.parseDouble(lineaScan);

            System.out.print("La división de 100 entre tu número es: ");
            double division = 100 / numerolinea;
            System.out.println(division);

            } catch (NumberFormatException i){
                System.out.println("Que es lo que no has entendido de numero? >:( ");

            } catch (IOException e) {
                System.out.println("Que coño has puesto? pon un número bobi :/" );

            }  catch (ArithmeticException u){
                System.out.println("... Para ser justos, no te avisé, prueba otra vez con un número que no sea cero :p");
            }finally {
               System.out.println("Se ha terminado el programa :3");
           }
    }

    public static void main(String[] args) {
            procesarEntrada();
    }



}
