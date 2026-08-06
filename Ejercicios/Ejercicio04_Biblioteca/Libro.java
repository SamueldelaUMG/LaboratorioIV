package Ejercicios.Ejercicio04_Biblioteca;

public class Libro extends Material{

    public Libro(String titulo, int anio){
        super(titulo, anio);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Informacion del libro: ");
        System.out.println("-------------------------------");
        System.out.println("Título: "+ getTitulo());
        System.out.println("Año de publicación: "+ getAnio());
    }


    
}
