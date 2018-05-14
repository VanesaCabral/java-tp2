package Ejercicio1;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		float precio, abono;
		
		System.out.print("Ingrese cantidad: ");
		cantidad = teclado.nextInt();
		System.out.print("Ingrese precio: ");
		precio = teclado.nextFloat();
		abono = cantidad * precio;
		System.out.print("Total a pagar: " +abono);
	}

}
