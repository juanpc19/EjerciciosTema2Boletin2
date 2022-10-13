package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tirada1=0, tirada2=0;
		String numero1,numero2;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Cuanto ha sacado en la primera tirada? ");

		numero1 = dogma.next(); 
		
		switch (numero1) {
			case "UNO": 
			tirada1=1;
			break;
			case "DOS": 
			tirada1=2;
			break;
			case "TRES": 
			tirada1=3;
			break;
			case "CUATRO": 
			tirada1=4;
			break;
			case "CINCO": 
			tirada1=5;
			break;
			case "SEIS": 
			tirada1=6;
			break;
			default:
			System.out.print("Error de seleccion, seleccione UNO,DOS,TRES,CUATRO,CINCO o SEIS");
		}
			
		System.out.print("Cuanto ha sacado en la segunda tirada? ");

		numero2 = dogma.next(); 
			
		switch (numero2) {
			case "UNO": 
			tirada2=1;
			break;
			case "DOS": 
			tirada2=2;
			break;
			case "TRES": 
			tirada2=3;
			break;
			case "CUATRO": 
			tirada2=4;
			break;
			case "CINCO": 
			tirada2=5;
			break;
			case "SEIS": 
			tirada2=6;
			break;
			default:
			System.out.print("Error de seleccion, introduzca: UNO, DOS, TRES, CUATRO, CINCO o SEIS");
			}
		
		System.out.print("El valor total de su tirada es: " + (tirada1 + tirada2));
		
		dogma.close();
		
	}
}
