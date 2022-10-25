package Excepciones;

public class Desbordamiento {
    public static void main(String[] args) {
        // Excepcion por desbordamiento
        try {
            int[] array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }

            System.out.println(array[11]);
        } catch (Exception e) {
            System.out.println("Se te desbordó para el indice 11");
        }

    }
}
