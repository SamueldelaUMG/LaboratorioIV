package Ejercicios.Ejercicio03_Pagos;

public class PagoEfectivo extends Pago{
    public PagoEfectivo(double monto){
        super(monto);
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando pago en efectivo...");
        System.out.println("Monto: Q. "+ getMonto());
    }
    
}
