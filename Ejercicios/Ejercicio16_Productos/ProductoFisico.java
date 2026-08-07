package Ejercicios.Ejercicio16_Productos;

public class ProductoFisico extends Producto {

    private double peso;
    public ProductoFisico(String nombre, double precio, double peso){
        super(nombre, precio);
        this.peso=peso;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }


    @Override
    public void mostrarInformacion(){
        System.out.println("Producto Fisico");
        System.out.println("---------------------------");
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Precio: Q." +getPrecio());
        System.out.println("Peso: "+ peso+ " kg");

    }
    
}
