package ejerciciostema2boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int diaSemana;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca dia de la semana usando uno de los numeros correspondientes "
		+ "mostrados a continuacion: LUNES 1, MARTES 2, \nMIERCOLES 3, JUEVES 4, "
		+ "VIERNES 5, SABADO 6, DOMINGO 7 ");
		
		diaSemana = dogma.nextInt();
		
		switch (diaSemana) {
		
			case 1:
				System.out.print("LUNES");
				break;
				
			case 2:
				System.out.print("MARTES");
				break;
				
			case 3:
				System.out.print("MIERCOLES");
				break;
				
			case 4:
				System.out.print("JUEVES");
				break;
				
			case 5:
				System.out.print("VIERNES");
				break;
				
			case 6:
				System.out.print("SABADO");
				break;
				
			case 7:
				System.out.print("DOMINGO");
				break;
				
			default:
				System.out.print("Error de seleccion, introduzca: LUNES 1, MARTES 2, MIERCOLES 3, JUEVES 4, VIERNES 5, SABADO 6 o DOMINGO 7");
		}
		
		dogma.close();
	}

}
