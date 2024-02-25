package tareaUD4;

/**Clase Persona, consta de un atributo edad de tipo entero y un método 
 * llamado calcularAniosHastaJubilacion
 * @author Jose Luis Ugalde
 * @version 0.1 25/02/2024*/
  
public class Persona {
	
	/**Atributo edad de tipo entero
	 * Valores válidos: Mayor que 16 y menor de 67
	 * Se inicializa en valor 16*/
	int edad=16;
	
	
	/**
	* Método que calcula los años que faltan hasta la jubilación
	* Una vez introducida la edad por teclado se le pasa mediante el parametro
	* de tipo Persona al metodo y calculará los años restantes hasta la jubilación.
	* @param  persona1 objeto de tipo Persona
	* @author José Luis Ugalde
	*/
	
	

	public void calcularAniosHastaJubilacion(Persona persona1) {
		
		/**Variable texto de tipo String
		 * Muestra por pantalla uno de los dos comentarios
		 * Solo te quedan 7 años. ¡ Animo que ya queda poco !
		 * Te quedan 23 años. ¡ A seguir trabajando gandúl !
		 * Se inicializa a un texto vacío */
		String texto="";
		
		/**Variable aniosRestantes de tipo entero
		 * Almacena la diferencia entre la edad de jubilación y la edad introducida por el ususario
		 * */
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
