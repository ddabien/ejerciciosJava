package Colecciones;


public class Persona {
    private String nombre, apellido, direccion;
    private int dni, celular, edad;

    // Constructor
    public Persona(String nombre, String apellido, String direccion, int dni, int celular, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.celular = celular;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }

    public int getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {

        // Creación LinkedList
        List<Persona> listaPersonas = new LinkedList<Persona>();

        // Agregar elementos a la lista

        listaPersonas.add(new Persona("Alberto", "Gonzalez", "Parana 123", 1234, 1112, 23));
        listaPersonas.add(new Persona("Julio", "Verne", "Argentina 342", 5678, 2323, 26));
        listaPersonas.add(new Persona("Maria", "Grisado", "Buchardo 134", 123, 45353, 33));
        listaPersonas.add(new Persona("Kilo", "Grisado", "Alvarada 245", 5252, 234244, 89));
        listaPersonas.add(new Persona("Damian", "Bogna", "Prestigui 2354", 23423111, 44244, 26));
        listaPersonas.add(new Persona("Giselle", "Vigno", "San Juan 1124", 432455, 67777, 45));
        listaPersonas.add(new Persona("Gabriel", "Sanchezina", "Chile 2422", 243556, 8997555, 14));
        listaPersonas.add(new Persona("Mariana", "Romano", "Brasil 2353", 53546677, 99898786, 56));
        listaPersonas.add(new Persona("Ines", "Baberti", "Entre Rios 1234", 3534535, 24222342, 32));
        listaPersonas.add(new Persona("Augusto", "Pedranga", "Independencia 100", 5235677, 67885445, 45));


        List<Persona> listaMayores = new LinkedList<Persona>();
        List<Persona> listaMenores = new LinkedList<Persona>();

        // Agregamos mayores o menores a la nueva lista

        for (Persona persona : listaPersonas) {
            if (persona.getEdad() >= 18) {
                listaMayores.add(persona);
            } else {
                listaMenores.add(persona);
            }
        }

        // Recorremos las listas
        System.out.println("\nLista de mayores de edad:");
        for (Persona persona : listaMayores) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad());
        }

        System.out.println("\nLista de menores de edad:");
        for (Persona persona : listaMenores) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad());
        }


    }

}
