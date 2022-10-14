package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tirada1=0, tirada2=0;//Declaro variables tipo int
		String numero1,numero2;//Declaro variables tipo string
		
		//Creo el Scanner, lo nombro y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el valor de la variable numero1
		System.out.print("Cuanto ha sacado en la primera tirada? ");

		//Asigno a variable numero 1 su valor usando el Scanner
		numero1 = dogma.next(); 
		
		//Creo un switch que evalue a variable numero1
		switch (numero1) {
		
		//Establezco que de coincidir numero1 con "UNO" se le asigne a tirada1 el valor 1
			case "UNO": 
				tirada1=1;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		//Establezco que de coincidir numero1 con "DOS" se le asigne a tirada1 el valor 2
			case "DOS": 
				tirada1=2;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		//Establezco que de coincidir numero1 con "TRES" se le asigne a tirada1 el valor 3
			case "TRES": 
				tirada1=3;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		//Establezco que de coincidir numero1 con "CUATRO" se le asigne a tirada1 el valor 4
			case "CUATRO": 
				tirada1=4;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		//Establezco que de coincidir numero1 con "CINCO" se le asigne a tirada1 el valor 5
			case "CINCO": 
				tirada1=5;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		//Establezco que de coincidir numero1 con "SEIS" se le asigne a tirada1 el valor 6
			case "SEIS": 
				tirada1=6;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		/*Establezco que de no coincidir nota con ningun case se ejecute impresion por consola: 
		"Error de seleccion, seleccione UNO,DOS,TRES,CUATRO,CINCO o SEIS"*/
			default:
				System.out.print("Error de seleccion, seleccione UNO,DOS,TRES,CUATRO,CINCO o SEIS");
		}
			
		//Solicito al usuario el valor de la variable numero2
		System.out.print("Cuanto ha sacado en la segunda tirada? ");

		//Asigno a variable numero 2 su valor usando el Scanner
		numero2 = dogma.next(); 
			
		//Creo un switch que evalue a variable numero2
		switch (numero2) {
		
		//Establezco que de coincidir numero2 con "UNO" se le asigne a tirada2 el valor 1
			case "UNO": 
				tirada2=1;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir numero2 con "DOS" se le asigne a tirada2 el valor 2
			case "DOS": 
				tirada2=2;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir numero2 con "TRES" se le asigne a tirada2 el valor 3
			case "TRES": 
				tirada2=3;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir numero2 con "CUATRO" se le asigne a tirada2 el valor 4
			case "CUATRO": 
				tirada2=4;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir numero2 con "CINCO" se le asigne a tirada2 el valor 5
			case "CINCO": 
				tirada2=5;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir numero2 con "SEIS" se le asigne a tirada2 el valor 6
			case "SEIS": 
				tirada2=6;
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		/*Establezco que de no coincidir nota con ningun case se ejecute impresion por consola: 
		"Error de seleccion, introduzca: UNO,DOS,TRES,CUATRO,CINCO o SEIS"*/
			default:
				System.out.print("Error de seleccion, introduzca: UNO, DOS, TRES, CUATRO, CINCO o SEIS");
			}
		
		//Muestro al usuario el valor total de sus dos tiradas mediante impresion en consola
		System.out.print("El valor total de su tirada es: " + (tirada1 + tirada2));
		
		//Cierro el Scanner
		dogma.close();
		
	}
}
