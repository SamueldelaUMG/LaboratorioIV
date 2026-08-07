package Ejercicios.Ejercicio08_Promedio;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
        double suma= 0;
        

        for (int i=0; i<5; i++){
            boolean notaValida= false;
            while(notaValida == false){
                try {
                    System.out.println("Ingrese la nota "+ (i+1)+ ":");
                    notas[i]= teclado.nextDouble();
                    if(notas[i]< 0 || notas [i]> 100){
                        System.out.println("ERROR: La nota debe estar entre 0 y 100. ");

                    }else{
                        notaValida = true;
                    }
                    
                    
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese nuevamente la nota "+ (i+1));
                    teclado.nextLine();
                }
            }
            suma = suma + notas[i];
        }
        double promedio = suma/ notas.length;
        System.out.println("--------------------");
        System.out.println("Promedio: "+ promedio);
    }
    
}
