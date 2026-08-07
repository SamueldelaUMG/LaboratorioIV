package Ejercicios.Ejercicio15_Empleados;

public class EmpleadoPorHoras extends Empleado{

    private double horas;
    private double pagoHora;

    public EmpleadoPorHoras(String nombre, double horas, double pagoHora){
        super(nombre);

        this.horas = horas;
        this.pagoHora = pagoHora;

    }


    public double getHoras(){
        return horas;
    }
    public void setHoras(double horas){
        this.horas= horas;
    }


    public double getPagoHora(){
        return pagoHora;
    }
    public void setPagoHora(double pagoHora){
        this.pagoHora= pagoHora;
    }

    @Override
    public double calcularPago(){
        return horas* pagoHora;
    }
    
}
