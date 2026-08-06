package Ejercicios.Ejercicio01_Animales;

public class Main {
    public static void main(String[] args) {
        
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        animal1.hacerSonido();
        animal2.hacerSonido();
    }
}