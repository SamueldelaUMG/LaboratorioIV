package Ejercicios.Ejercicio02_Vehiculos;

public class Moto extends Vehiculo{



    public Moto(String marca, String modelo){
        super(marca, modelo);
    }


    @Override
    public void mostrarDatos(){
        System.out.println("Vehiculo: Moto");
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+ getModelo());

    }


}
