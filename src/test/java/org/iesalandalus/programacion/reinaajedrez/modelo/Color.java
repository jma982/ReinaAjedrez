package org.iesalandalus.programacion.reinaajedrez.modelo;

 enum Color{BLANCO("blanco"), NEGRO("negro");

	private String cadenaAMostrar;
	
	private Color(String cadenaAMostrar){
	
	this.cadenaAMostrar=cadenaAMostrar;

	}	
	
	public String toString(){
		
	return cadenaAMostrar;
		
	}
	
}
	
 
