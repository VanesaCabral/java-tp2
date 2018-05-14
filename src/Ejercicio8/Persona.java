package Ejercicio8;

import java.util.Scanner;

public class Persona {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public void ingresarr() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese edad: ");
		edad = teclado.nextInt();
	}
	public void imprimirr() {
		System.out.println("Nombre: " +nombre);
		System.out.println("Edad: " +edad);
	}
}

