package tareaUD4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1=new Persona();
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		persona1.edad=leer.nextInt();
	
		
		persona1.calcularAñosHastaJubilacion(persona1);
		
		

	}

}
