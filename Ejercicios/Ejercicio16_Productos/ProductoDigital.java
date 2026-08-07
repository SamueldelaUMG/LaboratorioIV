package Ejercicios.Ejercicio16_Productos;

public class ProductoDigital extends Producto {
    private double tamanio;

    public ProductoDigital(String nombre, double precio, double tamanio){
        super(nombre, precio);
        this.tamanio=tamanio;

    }

    public double getTamanio(){
        return tamanio;

    }
    public void setTamanio(double tamanio){
        this.tamanio=tamanio;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Producto Digital");
        System.out.println("---------------------------");
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Precio: Q."+ getPrecio());
        System.out.println("Tamaño: "+ tamanio+ "GB");
    }
    
}
