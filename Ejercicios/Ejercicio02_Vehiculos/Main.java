package Ejercicios.Ejercicio02_Vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Carro("Toyota", "Corolla");
        Vehiculo vehiculo2 = new Moto("Honda", "CBR600" );


        vehiculo1.mostrarDatos();
        System.out.println("-----------------");
        vehiculo2.mostrarDatos();
    }
}
