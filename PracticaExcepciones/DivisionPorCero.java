package Excepciones;

import java.util.Scanner;

public class DivisionPorCero {
    public static void main(String[] args) {
        // Excepcion por division por cero

        try (Scanner teclado = new Scanner(System.in)) {
            try {
                int numero1, numero2, resultado;

                System.out.println("\nIngrese el primer numero: ");
                numero1 = teclado.nextInt();
                System.out.println("\nIngrese el segundo numero: ");
                numero2 = teclado.nextInt();

                resultado = numero1 / numero2;

                System.out.println("\nEl resultado es: " + resultado);
                
            } catch (Exception e) {
                System.out.println("\nNo se puede dividir por cero");
            }
        }
    }
}
