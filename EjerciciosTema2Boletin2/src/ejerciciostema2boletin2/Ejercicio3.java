package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numero1, numero2;
		String seleccion;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca el primer numero: ");
		
		numero1 = dogma.nextInt();
		
		System.out.print("Introduzca el segundo numero: ");
		
		numero2 = dogma.nextInt();
		
		System.out.print("A. SUMAR LOS NUMEROS\nB. RESTAR LOS NUMEROS "
				+ "\nC. MULTIPLICAR LOS NUMEROS \nD. DIVIDIR LOS NUMEROS\n");
		
		System.out.print("Seleccione que operacion quiere llevar a cabo de la lista anterior: ");
		
		seleccion = dogma.next();
		
		switch (seleccion) {
		
			case "A":
			System.out.print("La suma de ambos numeros es: " + (numero1+numero2));
			break;
			
			case "B":
			System.out.print("La resta de ambos numeros es: " + (numero1-numero2));
			break;
			
			case "C":
			System.out.print("La multiplicacion de ambos numeros es: " + numero1*numero2);
			break;
			
			case "D":
			System.out.print("La division de ambos numeros es: " + numero1/numero2);
			break;
			
			default:
			System.out.print("Error de seleccion, introduzca: A, B, C o D");
		}

		dogma.close();
		
	}

}
