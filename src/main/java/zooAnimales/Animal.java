package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero/*, Zona zona*/){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        //this.zona = zona;
        totalAnimales++;
    }

    public static String totalPorTipo(){
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
                "Aves: " + Ave.cantidadAves() + "\n" +
                "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
                "Peces: " + Pez.cantidadPeces() + "\n" +
                "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public String toString(){
        if (zona == null){
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + ", y mi genero es " + genero;
        }
        else{
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + ", y mi genero es " + genero + ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo().getNombre();
        }
    }

}
