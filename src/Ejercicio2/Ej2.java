package Ejercicio2;
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int num,to;
		System.out.print("Ingrese un numero: ");
		num = teclado.nextInt();
		to = 10000 / num;
		
		if (to > 1000 ) {
			System.out.print("Tiene un digito");
		}else {
			if(to > 100) {
				System.out.print("Tiene dos digitos");
			}else {
				if(to > 10) {
					System.out.print("Tiene tres digitos");
				}else {
						System.out.print("Tiene cuatro digito");
					}
				}
			}
		}
	}

