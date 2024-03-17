package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }

    public Zona() {
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }
}