package Ejercicios.Ejercio15_Empleados;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salario;
    public EmpleadoTiempoCompleto(String nombre, double salario){
        super(nombre);
        this.salario=salario;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }

    @Override
    public double calcularPago(){
        return salario;
    }

    
    
}
