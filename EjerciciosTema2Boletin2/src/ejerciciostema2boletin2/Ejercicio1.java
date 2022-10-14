package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int nota;//Declaro variables
		
		//Creo el Scanner, lo nombro y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el valor de la variable nota
		System.out.print("Introduzca la nota con un numero entero entre 0 y 10: ");
		
		//Asigno a nota su valor mediante uso del Scanner
		nota = dogma.nextInt();
		
		//Creo un switch que evalue a variable nota
		switch (nota) {
			
		//Establezco que de coincidir nota con 0,1,2,3,4 se ejecute impresion por consola: "INSUFICIENTE"
			case 0,1,2,3,4: 
				System.out.print("INSUFICIENTE");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir nota con 5 se ejecute impresion por consola: "SUFICIENTE"
			case 5:
				System.out.print("SUFICIENTE");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir nota con 6 se ejecute impresion por consola: "BIEN"	
			case 6:
				System.out.print("BIEN");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior		
				break;
				
		//Establezco que de coincidir nota con 7,8 se ejecute impresion por consola: "NOTABLE"
			case 7,8:
				System.out.print("NOTABLE");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;	
			
		//Establezco que de coincidir nota con 9,10 se ejecute impresion por consola: "SOBRESALIENTE"
			case 9,10:
				System.out.print("SOBRESALIENTE");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;	
				
		/*Establezco que de no coincidir nota con ningun case se ejecute impresion por consola: 
		"Error de seleccion, introduzca un numero entero entre: 0 y 10"*/
			default:
				System.out.print("Error de seleccion, introduzca un numero entero entre: 0 y 10");
		}

		//Cierro Scanner
		dogma.close();	
				
	}

}
