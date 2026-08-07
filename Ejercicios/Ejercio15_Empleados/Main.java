package Ejercicios.Ejercio15_Empleados;

public class Main {
    public static void main(String[] args) {
        Empleado empelado1 = new EmpleadoTiempoCompleto("Carlos", 5000);
        Empleado empleado2 = new EmpleadoPorHoras("Pedro", 40, 50);


        System.out.println("---------------------------------------");

        System.out.println("Empleado: "+ empelado1.getNombre());
        System.out.println("Pago: Q."+ empelado1.calcularPago());

        System.out.println("---------------------------------------");

        System.out.println("Empleado: "+ empleado2.getNombre());
        System.out.println("Pago: Q."+ empleado2.calcularPago());

        System.out.println("---------------------------------------");
    }
    
}
