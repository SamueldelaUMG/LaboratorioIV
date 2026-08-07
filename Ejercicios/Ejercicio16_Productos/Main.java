package Ejercicios.Ejercicio16_Productos;

public class Main {



    public static void main(String[] args) {
        Producto producto1 = new ProductoFisico("Laptop", 5600, 2.5);
        Producto producto2 = new ProductoDigital("Curso de Java", 150, 5);

        System.out.println("");
        producto1.mostrarInformacion();
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        producto2.mostrarInformacion(); 
    }   
    


    
}
