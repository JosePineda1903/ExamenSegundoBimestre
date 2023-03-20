package Prueba;
public class PruebaVehiculos {
  public static void main (String []args){
    Vehiculo obj = new Motocicleta();
     String[] vector= obj.acelerar();
     
    Vehiculo ob = new Automovil();
    String[] vect= ob.acelerar();

     
     for (int i = 0; 1<2; i++){
         System.out.println("Almacenado "  +vector[i]+vect[1]);
     }
     }
  }
    

