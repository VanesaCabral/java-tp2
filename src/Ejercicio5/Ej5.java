package Ejercicio5;
import java.util.Scanner;
public class Ej5 {
		public static void main(String[] ar) {
			Scanner teclado = new Scanner(System.in);
			int num = 0;
			int suma = 0;
			while(num != 9999) {
				System.out.print("Ingrese numero: ");
				num = teclado.nextInt();
				if (num == 9999) {
					System.out.println("Valor acumulado: "+suma);
				}else {
					suma = suma + num;				
					}
				}
			
			if(suma == 0) {
				System.out.print("El valor es igual a 0");
			}else {
				if(suma > 0) {
					System.out.println("El valor es mayor a cero ");
			}else{
				System.out.println("El valor es menor a cer");
				
				}
			}
	}
}
