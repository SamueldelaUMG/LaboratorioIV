package Ejercicios.Ejercicio04_Biblioteca;

public class Main {
    public static void main(String[] args) {
        Material material1 = new Libro("Noticia de un secuestro", 1996);
        Material material2 = new Revista("National Geographic", 2026);
        System.out.println();
        material1.mostrarInformacion();
        System.out.println();
        System.out.println();
        material2.mostrarInformacion();
    }
}
