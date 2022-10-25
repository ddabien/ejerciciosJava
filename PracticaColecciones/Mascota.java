package Colecciones;
import java.util.*;

public class Mascota {
    private String nombre, especie, sexo, color, pelaje, raza;

    // Constructor
    public Mascota( String nombre, String especie, String sexo, String color, String pelaje, String raza ) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }

    // Getters y Setters ----------------
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public String getSexo() {
        return sexo;
    }
    public String getColor() {
        return color;
    }
    public String getPelaje() {
        return pelaje;
    }
    public String getRaza() {
        return raza;
    }


    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }
    public void setEspecie( String especie ) {
        this.especie = especie;
    }
    public void setSexo( String sexo ) {
        this.sexo = sexo;
    }
    public void setColor( String color ) {
        this.color = color;
    }
    public void setPelaje( String pelaje ) {
        this.pelaje = pelaje;
    }
    public void setRaza( String raza ) {
        this.raza = raza;
    }

    public static void main(String[] args) {
        // Crear Lista
		
    List <Mascota> listaMascotas = new ArrayList<Mascota> ();

        listaMascotas.add(new Mascota("Melani", "Perro", "Macho", "Claro", "Corto", "pekines"));
        listaMascotas.add(new Mascota("Cukito", "Perro", "Macho", "Negro", "Corto", "Perro"));
        listaMascotas.add(new Mascota("Petunio", "Perro", "Macho", "Marron_blanco", "Corto", "Perro"));
        listaMascotas.add(new Mascota("Lucia", "Gato", "Hembra", "Negro", "Corto", "Gato_domestico"));

        System.out.println("\nLista de Mascotas: ");
        for (Mascota mascota : listaMascotas) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie() + ", Pelaje: " + mascota.getPelaje());
        }


        System.out.println("\Cambiar el nombre a las primeras 2 mascotas: ");
        listaMascotas.get(0).setNombre("Melaniee");
        listaMascotas.get(1).setNombre("Cuquitoos");

        for (Mascota mascota : listaMascotas) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie() + ", Pelaje: " + mascota.getPelaje());
        }

        listaMascotas.add(new Mascota("Caballito", "Caballo", "Hembra", "Marron", "corto", "Caballo"));
        listaMascotas.add(new Mascota("PioPio", "pajaro", "Hembra", "amarillo", "corto", "Pajaro"));

        System.out.println("\nSe agregaron 2 nuevas mascotas! ");
        // Mostrar a los perros

        System.out.println("Son perros");

        for (Mascota mascota : listaMascotas) {
            if (mascota.getEspecie().equals("Perro")) {
                System.out.println("Nombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie() + ", Pelaje: " + mascota.getPelaje());
            }
        }
    }



    

      
}
