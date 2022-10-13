package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String tipoCarnet;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca su tipo de carnet de conducir, use las opciones indicadas a continuacion: E,D,C1,C2,C3,C4,C5,A,B1,B2 ");
		
		tipoCarnet = dogma.next();
		
		switch (tipoCarnet) {
		
			case "E": 
			System.out.print("Ese tipo de carnet pertenece a remolques");
			break;
			
			case "D": 
			System.out.print("Ese tipo de carnet pertenece a autobuses");
			break;
			
			case "C1", "C2", "C3", "C4", "C5": 
			System.out.print("Ese tipo de carnet pertenece a camiones");	
			break;
			
			case "A": 
			System.out.print("Ese tipo de carnet pertenece a motocicletas");
			break;
			
			case "B1", "B2": 
			System.out.print("Ese tipo de carnet pertenece a automoviles");
			break;
			
			default:
			System.out.print("Error de seleccion, introduzca: E, D, C1, C2, C3, C4, C5, A, B1, B2");
		}
		
		dogma.close();

	}

}
