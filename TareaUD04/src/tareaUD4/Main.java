package tareaUD4;

import java.util.Scanner;

/**
* Clase Main
* Es la clase principal
* @author José Luis Ugalde / Entorno de desarrollo
* @version 0.1, 2024/02/25
*/

public class Main {
	
	/**Método de la clase principal
	 * Descripcion: Crea un objeto de la clase Persona
	 * Pide por teclado que se introduzca una edad y se almacena en el atributo edad
	 * del objeto persona1 perteneciente a la clase Persona
	 *  @param args proporciona argumentos de línea de comandos como una matriz de objetos String */
	

	public static void main(String[] args) {
		
		
		Persona persona1=new Persona();
		
		Scanner leer= new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce tu edad");
		
		persona1.edad=leer.nextInt();
		
		}while((persona1.edad<16)&&(persona1.edad>67));
	
		
		persona1.calcularAniosHastaJubilacion(persona1);
		
		

	}

}
