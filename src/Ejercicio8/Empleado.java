package Ejercicio8;

import java.util.Scanner;

public class Empleado extends Persona {
	private Scanner teclado;
	private int sueldo;
	public void ingresar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese sueldo: ");
		sueldo = teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Sueldo: " +sueldo);
	}
}
