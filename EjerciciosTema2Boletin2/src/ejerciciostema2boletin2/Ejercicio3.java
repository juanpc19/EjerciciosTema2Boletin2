package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numero1, numero2;//Declaro variables tipo int
		String seleccion;//Declaro variable tipo String
		
		//Creo el Scanner, lo nombro y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el valor de la variable numero1
		System.out.print("Introduzca el primer numero: ");
		
		//Asigno a variable numero 1 su valor usando el Scanner
		numero1 = dogma.nextInt();
		
		//Solicito al usuario el valor de la variable numero2
		System.out.print("Introduzca el segundo numero: ");
		
		//Asigno a variable numero 2 su valor usando el Scanner
		numero2 = dogma.nextInt();
		
		//Muestro al usuario las operaciones disponibles
		System.out.print("A. SUMAR LOS NUMEROS\nB. RESTAR LOS NUMEROS "
				+ "\nC. MULTIPLICAR LOS NUMEROS \nD. DIVIDIR LOS NUMEROS\n");
		
		//Solicito al usuario que seleccione una operacion de la lista anterior
		System.out.print("Seleccione que operacion quiere llevar a cabo de la lista anterior: ");
		
		//Asigno la seleccion del usuario a la variable seleccion mediante uso de Scanner
		seleccion = dogma.next();
		
		//Creo un switch que evalue a variable seleccion
		switch (seleccion) {
		
		/*Establezco que de coincidir seleccion con "A" se ejecute impresion por consola: 
		"La suma de ambos numeros es: " + (numero1+numero2)*/
			case "A":
				System.out.print("La suma de ambos numeros es: " + (numero1+numero2));
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		/*Establezco que de coincidir seleccion con "B" se ejecute impresion por consola: 
		"La suma de ambos numeros es: " + (numero1-numero2)*/
			case "B":
				System.out.print("La resta de ambos numeros es: " + (numero1-numero2));
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		/*Establezco que de coincidir seleccion con "C" se ejecute impresion por consola: 
		"La multiplicacion de ambos numeros es: " + numero1*numero2*/
			case "C":
				System.out.print("La multiplicacion de ambos numeros es: " + numero1*numero2);
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		/*Establezco que de coincidir seleccion con "D" se ejecute impresion por consola: 
		"La division de ambos numeros es: " + numero1/numero2*/
			case "D":
				System.out.print("La division de ambos numeros es: " + numero1/numero2);
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
			
		/*Establezco que de no coincidir nota con ningun case se ejecute impresion por consola: 
		Error de seleccion, introduzca: "Error de seleccion, introduzca: A, B, C o D"*/
			default:
				System.out.print("Error de seleccion, introduzca: A, B, C o D");
		}

		//Cierro Scanner
		dogma.close();
		
	}

}
