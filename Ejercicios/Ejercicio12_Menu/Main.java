package Ejercicios.Ejercicio12_Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
        System.out.println("");
        System.out.println("       MENU       ");
        System.out.println("------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("Seleccione una ocpion: ");

        int opcion = teclado.nextInt();
        if (opcion == 1 || opcion == 2) {
            System.out.println("Ingrese el primero numero: ");
            double n1 = teclado.nextDouble();

            System.out.println("Ingrese el segundo numero. ");
            double n2 = teclado.nextDouble();

            switch (opcion) {
                case 1:
                    double suma = n1 + n2;
                    System.out.println("Resultado de la suma: " + suma);

                    break;

                case 2:
                    double resta = n1 - n2;
                    System.out.println("Resultado de la resta: " + resta);

                    break;
            }
        }else{
            System.out.println("ERROR: Opcion no valida. ");

        }
    }catch(InputMismatchException e){
        System.out.println("ERROR: Deber ingresar un numero. ");

    }


    }

}