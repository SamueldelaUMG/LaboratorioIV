package Ejercicios.Ejercicio07_Entrada_Numerica;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        boolean NumeroValido = false;
        while(NumeroValido == false){
            try {
                System.out.println("Ingrese un numero. ");
                double numero = teclado.nextDouble();
                System.out.println("El numero ha sido guardado correctamente. ");
                NumeroValido = true;
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("ERROR: Deber ingresar un numero. ");
                teclado.nextLine();
            }
        }

    }
    
}
