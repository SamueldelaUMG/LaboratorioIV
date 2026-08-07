package Ejercicios.Ejercicio06_Division;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean datosCorrectos = false;


        while(datosCorrectos == false){

            try {
                System.out.println("DIVISION SEGURA");
                System.out.println("------------------------");
                System.out.println("Ingrese el primero numero: ");
                double numero1 = teclado.nextDouble();

                System.out.println("Ingrese el segundo numero: ");
                double numero2 = teclado.nextDouble();

                if (numero2 == 0){
                    System.out.println("ERROR: No se puede dividir entre cero. ");
                }else{
                    double resultado = numero1/ numero2;
                    System.out.println("Resultado: "+ resultado);
                    datosCorrectos= true;
                }
                
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("ERROR: Debe ingresar un numero. ");
                teclado.nextLine();
            }
        }
    }
    
}
