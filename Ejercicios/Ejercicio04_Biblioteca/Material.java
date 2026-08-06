package Ejercicios.Ejercicio04_Biblioteca;

public abstract class Material {

    private String titulo;
    private int anio;


    public Material(String titulo, int anio){
        this.titulo=titulo;
        this.anio=anio;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        this.anio=anio;
    }

    public abstract void mostrarInformacion();




    
}
