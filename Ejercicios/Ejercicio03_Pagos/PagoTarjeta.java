package Ejercicios.Ejercicio03_Pagos;

public class PagoTarjeta extends Pago{

    public PagoTarjeta(double monto){
        super(monto);
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando pago con tarjeta...");
        System.out.println("Monto: Q. "+ getMonto());
    }
}
