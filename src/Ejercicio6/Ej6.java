package Ejercicio6;
import java.util.Scanner;

public class Ej6 {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public void ingresar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese sueldo: ");
		sueldo = teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Nombre: " +nombre);
		System.out.println("Sueldo: " +sueldo);
	}
	
	public void sueldo() {
		if(sueldo > 3000) {
			System.out.print("Usted tiene que pagar impuestos."); 
		}
	}
	
	public static void main(String[] ar) {
		Ej6 Empleado;
		Empleado = new Ej6();
		Empleado.ingresar();
		Empleado.imprimir();
		Empleado.sueldo();
		
	}

}
