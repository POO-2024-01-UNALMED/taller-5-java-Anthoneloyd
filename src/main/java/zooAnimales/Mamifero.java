package zooAnimales;

import java.util.ArrayList;

public class Mamifero {
    private ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private String colorPelaje;
    private int patas;

    public Mamifero() {
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, String colorPelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.colorPelaje = colorPelaje;
        this.patas = patas;

        listado.add(this);
    }
}