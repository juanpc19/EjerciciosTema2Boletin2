package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int diaSemana;//Declaro variable
		
		//Creo el Scanner, lo nombro y lo importo
		Scanner dogma = new Scanner(System.in);
		
		/*Solicito al usuario el valor de la variable diaSemana suministrandole 
		previamente las opciones disponibles*/
		System.out.print("Introduzca dia de la semana usando uno de los numeros correspondientes "
		+ "mostrados a continuacion: LUNES 1, MARTES 2, \nMIERCOLES 3, JUEVES 4, "
		+ "VIERNES 5, SABADO 6, DOMINGO 7 ");
		
		//Asigno la seleccion del usuario a la variable seleccion mediante uso de Scanner
		diaSemana = dogma.nextInt();
		
		//Creo un switch que evalue a variable diaSemana
		switch (diaSemana) {
		//Establezco que de coincidir diaSemana con 1 se ejecute impresion por consola: "LUNES"
			case 1:
				System.out.print("LUNES");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir diaSemana con 2 se ejecute impresion por consola: "MARTES"
			case 2:
				System.out.print("MARTES");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir diaSemana con 3 se ejecute impresion por consola: "MIERCOLES"
			case 3:
				System.out.print("MIERCOLES");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir diaSemana con 4 se ejecute impresion por consola: "JUEVES"
			case 4:
				System.out.print("JUEVES");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir diaSemana con 5 se ejecute impresion por consola: "VIERNES"
			case 5:
				System.out.print("VIERNES");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir diaSemana con 6 se ejecute impresion por consola: "SABADO"
			case 6:
				System.out.print("SABADO");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		//Establezco que de coincidir diaSemana con 7 se ejecute impresion por consola: "DOMINGO"
			case 7:
				System.out.print("DOMINGO");
		//Hago break para evitar el resto de ejecuciones de case de cumplirse la coincidencia anterior
				break;
				
		/*Establezco que de no coincidir nota con ningun case se ejecute impresion por consola: 
		"Error de seleccion, introduzca: LUNES 1, MARTES 2, MIERCOLES 3, JUEVES 4, VIERNES 5, SABADO 6 o DOMINGO 7"*/
			default:
				System.out.print("Error de seleccion, introduzca: LUNES 1, MARTES 2, MIERCOLES 3, JUEVES 4, VIERNES 5, SABADO 6 o DOMINGO 7");
		}
		
		//Cierro Scanner
		dogma.close();
	}

}
