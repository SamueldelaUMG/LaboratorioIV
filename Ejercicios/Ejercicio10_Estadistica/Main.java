package Ejercicios.Ejercicio10_Estadistica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[5];

        double suma= 0;
        for(int i=0; i<5; i++){
            System.out.println("Ingrese el numero "+ (i+1)+ ": ");
            numeros[i]= teclado.nextDouble();  
        }
        double mayor = numeros[0];
        double menor = numeros[0];

        for(int i=0; i<5; i++){
            suma = suma + numeros[i];

            if(numeros[i]> mayor){
                mayor = numeros[i];
            }
            if (numeros[i]< menor){
                menor = numeros[i];
            }
        }

        double promedio = suma / numeros.length;

        System.out.println("");
        System.out.println("");
        System.out.println("Suma: "+ suma);
        System.out.println("Promedio: "+ promedio);
        System.out.println("Mayor: "+ mayor);
        System.out.println("Menor: " + menor);

    }
    
}
