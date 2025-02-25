public class bombilla {
   boolean estado = false;

   void encenderBombilla (){
       this.estado = true;
       System.out.println("La bombilla esta ahora encendida");
   }

   void apagarBombilla() {
       this.estado = false;
       System.out.println("La bombilla esta ahora apagada");
   }

   void comprobarEstado() {
       String estadoString;
       if (!estado)
           estadoString = "apagado";
       else estadoString = "encendido";
    System.out.println("El estado actual de la bombilla es: " + estadoString);

   }

}