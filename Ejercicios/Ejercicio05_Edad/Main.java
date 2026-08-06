package Ejercicios.Ejercicio05_Edad;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean edadValida = false;

        while(edadValida == false){
            try{

                System.out.println("Ingrese su edad: ");
                int edad = teclado.nextInt();
                if(edad<0){
                    System.out.println("La edad debe ser positiva. ");

                }else{
                    System.out.println("La edad ha sido guardada correctamente");
                    edadValida= true;
                }

            }catch(Exception e){
                System.out.println("ERROR: Debe ingresar un numero ");
                teclado.nextLine();

            }
        }

    }
    
}
