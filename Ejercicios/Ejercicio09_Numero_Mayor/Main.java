package Ejercicios.Ejercicio09_Numero_Mayor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[3];
        for(int i=0; i<3; i++){
            System.out.println("Ingrese el numero "+ (i+1)+ ": ");
            numeros[i]= teclado.nextDouble();

        }
        double mayor = numeros[0];
        for(int i =1; i<3; i++){
            if(numeros[i]> mayor){
                mayor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: "+ mayor);

    }
    
}
