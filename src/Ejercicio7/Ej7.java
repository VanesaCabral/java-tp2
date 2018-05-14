package Ejercicio7;

import java.util.Scanner;
public class Ej7 {
	private Scanner teclado;
	private int n1,n2,suma,multi,res,divi;
	
	public void ingresar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		n1= teclado.nextInt();
		System.out.print("Ingrese otro numero: ");
		n2 = teclado.nextInt();
	}
	
	public int suma() {
		suma = n1 + n2;
		return suma;
	}
	
	public int resta() {
		res = n1 - n2;
		return res;
	}
	
	public int division() {
		divi = n1 / n2;
		return divi;
	}
	
	public int multiplicacion() {
		multi = n1 * n2;
		return multi;
	}
	
	public void imprimir() {
		System.out.println("Suma= " +suma);
		System.out.println("Resta= " +res);
		System.out.println("Division= " +divi);
		System.out.println("Multiplicacion= " +multi);
	}
	
	public static void main(String[] ar) {
		Ej7 Operacion;
		Operacion = new Ej7();
		Operacion.ingresar();
		Operacion.suma();
		Operacion.resta();
		Operacion.division();
		Operacion.multiplicacion();
		Operacion.imprimir();
		
	}

}


