package Colecciones;


public class Autos {
    private int num_patente;
    private String marca, modelo, color, chasis;

    // Constructor
    public Autos(int num_patente, String marca, String modelo, String color, String chasis) {
        this.num_patente = num_patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
    }

    // Getters y Setters
	
    public int getNum_patente() {
        return num_patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getChasis() {
        return chasis;
    }

  // ------------------------------------------
  
    public void setNum_patente(int num_patente) {
        this.num_patente = num_patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public static void main(String[] args) {

        // Stack
        Stack<Autos> pilaAutos = new Stack<Autos>();

        pilaAutos.push(new Autos(1, "Ford", "Escort", "Azul", "XYX222"));
        pilaAutos.push(new Autos(2, "Chevrolet", "Corsa", "Negro", "ABX123"));
        pilaAutos.push(new Autos(3, "Fiat", "Uno", "Blanco", "YYY149"));
        pilaAutos.push(new Autos(4, "Peugeot", "Partner", "Rojo", "CVB232"));
        pilaAutos.push(new Autos(5, "Volwkswagen", "Gol_Trend", "Verde", "MMU357"));
        pilaAutos.push(new Autos(6, "Chery", "Tiggo", "Blanco", "AXD543"));
        pilaAutos.push(new Autos(7, "Renault", "kangoo", "Rojo", "MLX234"));

        // -> Se busca el auto de color ROJO
        System.out.println("\nBuscar autos de color rojo: ");
        for (Autos pil : pilaAutos) {
            if (pil.getColor().equals("Rojo")) {
                System.out.println("Patente: " + pil.getNum_patente() + ", Marca: " + pil.getMarca() + ", Modelo: "
                        + pil.getModelo() + ", Color: " + pil.getColor() + ", Chasis: " + pil.getChasis());
            }
        }

        // Auto de la cima de la PILA
		
        System.out.println("\Auto de la cima de la PILA: ");
        System.out.println("Patente: " + pilaAutos.peek().getNum_patente() + ", Marca: " + pilaAutos.peek().getMarca()
                + ", Modelo: " + pilaAutos.peek().getModelo() + ", Chasis: " + pilaAutos.peek().getChasis());

        // Borramos el auto por encima de la PILA
        System.out.println("\Borramos el auto en la cima de la PILA: ");
        pilaAutos.pop();

        // Agregamos 2 autos nuevos
        System.out.println("\nAgregamos 2 autos nuevos: ");
        pilaAutos.push(new Autos(8, "Ford", "Ranger", "Rojo", "XDE231"));
        pilaAutos.push(new Autos(9, "Renault", "Express", "Azul", "POI147"));

        // Mostramos los autos de la PILA
        System.out.println("\Autos de la PILA: ");
        for (Autos pil : pilaAutos) {
            System.out.println("Patente: " + pil.getNum_patente() + ", Marca: " + pil.getMarca() + ", Modelo: "
                    + pil.getModelo() + ", Color: " + pil.getColor() + ", Chasis: " + pil.getChasis());
        }
    }
}
