package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int nota;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca la nota con un numero entero entre 0 y 10: ");
		
		nota = dogma.nextInt();
		
		switch (nota) {
		
			case 0,1,2,3,4: 
				System.out.print("INSUFICIENTE");
				break;
				
			case 5:
				System.out.print("SUFICIENTE");
				break;
				
			case 6:
				System.out.print("BIEN");
				break;
				
			case 7,8:
				System.out.print("NOTABLE");
				break;	
				
			case 9,10:
				System.out.print("SOBRESALIENTE");
				break;	
				
			default:
				System.out.print("Error de seleccion, introduzca un numero entero entre: 0 y 10");
		}

		dogma.close();	
				
	}

}
