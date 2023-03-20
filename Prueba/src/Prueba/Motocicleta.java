package Prueba;

public class Motocicleta extends Vehiculo{
    boolean tieneCasco;
    
   public void Motocicletacasco(){
   }
   String[] array = new String[10];
    @Override
    public String[] acelerar(){  // metodo acelarar que heredan de la clase vehiculo 
        array [0]= "La velocidad actual de la Moto es de 199km/h";  
        return array;
   }
    
}
