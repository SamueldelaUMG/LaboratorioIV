package Ejercicios.Ejercicio11_Edades;
import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean edadValida= false;
        while(edadValida==false){
            System.out.println("Ingrese su edad: ");
            int edad = teclado.nextInt();

            if(edad<0 || edad>150){
                System.out.println("ERROR: La edad no se encuentra entre el rango permitido. ");

            }else{
                edadValida= true;

                if(edad<=12){
                    System.out.println("Clasificacion: Infante");

                }else if(edad<=17){
                    System.out.println("Clasificacion: Adolescente");
                }else{
                    System.out.println("Clasificacion: Adulto");
                }

            }
        }

    }
    
}
