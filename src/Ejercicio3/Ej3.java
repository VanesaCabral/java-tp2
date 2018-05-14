package Ejercicio3;
import java.util.Scanner;

public class Ej3 {
		public static void main(String[] ar) {
			Scanner teclado = new Scanner(System.in);
			int[] num = new int[10];
			int i=0;
			int par = 0,impar = 0;
			
			for(i=0;i<=9;i++) {
				
				System.out.print("Ingrese un numero: ");
				num[i] = teclado.nextInt();	
				
				
			}
			for(i=0;i<=9;i++) {
			if(num[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			}
			System.out.println("Numeros pares: " +par);
			System.out.println("Numeros impares: " +impar);
		}
}
	


