package Prueba;

public class Automovil extends Vehiculo{
    int numPuertas;
    
    public void Automovil(){
        
    }
    String[] array = new String[10];
    @Override
    public String[] acelerar(){  // metodo acelarar que heredan de la clase vehiculo 
        array [0]= "El velocidad actual del Carro es de 199km/h";  
        return array;
    }
}
