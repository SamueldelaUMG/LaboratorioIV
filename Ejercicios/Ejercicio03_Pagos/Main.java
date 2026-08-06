package Ejercicios.Ejercicio03_Pagos;

public class Main {
    public static void main(String[] args) {
        
        Pago pago1 = new PagoTarjeta(1500);
        Pago pago2 = new PagoEfectivo(2000);

        pago1.procesarPago();
        System.out.println("---------------------");
        pago2.procesarPago();
    }
    
}
