package tareaUD4;

public class Persona {
	
	int edad;
	
	public void calcularAñosHastaJubilacion(Persona persona1) {
		
		String texto="";
		int aniosRestantes=67-persona1.edad;
		
		if (aniosRestantes<10) {
			
			texto="Solo te quedan 7 años. ¡ Animo que ya queda poco !";
		}
		
		if(aniosRestantes>20) {
			
			texto="Te quedan 23 años. ¡ A seguir trabajando gandúl !";
		}
		
		System.out.println(texto);
	}

}
