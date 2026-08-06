package Ejercicios.Ejercicio04_Biblioteca;

public class Revista extends Material {
    public Revista(String titulo, int anio){
        super(titulo, anio);
    }


    @Override
    public void mostrarInformacion(){
        System.out.println("Informacion de la Revista: ");
        System.out.println("-------------------------------");
        System.out.println("Título: "+ getTitulo());
        System.out.println("Año de publicación: "+ getAnio());
    }
}
