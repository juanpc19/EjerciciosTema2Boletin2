package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String tipoCarnet;//Declaro variable
		
		//Creo un Scanner, lo nombro y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario que introduzca su seleccion con una de las opciones mostradas
		System.out.print("Introduzca su tipo de carnet de conducir, use las opciones indicadas a continuacion: E,D,C1,C2,C3,C4,C5,A,B1,B2 ");
		
		//Asigno la seleccion del usuario a la variable tipoCarnet mediante uso del Scanner
		tipoCarnet = dogma.next();
		
		//Creo un switch que evalue a variable tipoCarnet
		switch (tipoCarnet) {
		
		/*Establezco que de coincidir tipoCarnet con "E" se ejecute impresion por consola:
		 * "Ese tipo de carnet pertenece a remolques"*/
			case "E": 
			System.out.print("Ese tipo de carnet pertenece a remolques");
			break;
			
		/*Establezco que de coincidir tipoCarnet con "D" se ejecute impresion por consola: 
		 * "Ese tipo de carnet pertenece a autobuses"*/
			case "D": 
			System.out.print("Ese tipo de carnet pertenece a autobuses");
			break;
			
		/*Establezco que de coincidir tipoCarnet con "C1", "C2", "C3", "C4", "C5" se ejecute 
		* impresion por consola: "Ese tipo de carnet pertenece a camiones"*/
			case "C1", "C2", "C3", "C4", "C5": 
			System.out.print("Ese tipo de carnet pertenece a camiones");	
			break;
			
		/*Establezco que de coincidir tipoCarnet con "A" se ejecute impresion por consola: 
		 * "Ese tipo de carnet pertenece a motocicletas"*/
			case "A": 
			System.out.print("Ese tipo de carnet pertenece a motocicletas");
			break;
			
		/*Establezco que de coincidir tipoCarnet con "B1","B2" se ejecute impresion por consola: 
		 * "Ese tipo de carnet pertenece a automoviles"*/
			case "B1", "B2": 
			System.out.print("Ese tipo de carnet pertenece a automoviles");
			break;
			
		/*Establezco que de no coincidir nota con ningun case se ejecute impresion por consola: 
		 * "Error de seleccion, introduzca: E, D, C1, C2, C3, C4, C5, A, B1, B2"*/
			default:
			System.out.print("Error de seleccion, introduzca: E, D, C1, C2, C3, C4, C5, A, B1, B2");
		}

		//Cierro el Scanner
		dogma.close();

	}

}
