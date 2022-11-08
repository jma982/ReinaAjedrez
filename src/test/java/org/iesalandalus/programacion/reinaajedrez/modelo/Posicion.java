package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

import org.iesalandalus.programacion.utilidades.*;

// Creamos la clase "Posición" dentro de nuestro paquete de trabajo
public class Posicion {

	// Declaramos las variables o atributos de nuestra clase con sus respectivos tipos primitivos
	
	private int fila;
	private char columna; 
	
	// MÉTODO CONSTRUCTOR PRINCIPAL:
	
	public Posicion(int fila, char columna) {
		
		// Validación del parámetro fila en el método constructor
		
		do {
			
			try { 
				fila=Entrada.entero();
				this.fila=fila;
								
			} catch (IllegalArgumentException e){ 
				
				System.out.println("Error, sólo puede indicar un número del 1 al 8 " + e);
			
			}
			
			} while (fila<1 || fila >8);
		
		// Validación del argumento columna en el método constructor
		
		
		columna=Entrada.caracter();
		this.columna=columna; 
		
		try {
			
			switch (columna){
			
				case'a': System.out.println("La columna es "+columna); break;
				case'A': System.out.println("La columna es "+columna); break;
				case'b': System.out.println("La columna es "+columna); break;
				case'B': System.out.println("La columna es "+columna); break;
				case'c': System.out.println("La columna es "+columna); break;
				case'C': System.out.println("La columna es "+columna); break;
				case'd': System.out.println("La columna es "+columna); break;
				case'D': System.out.println("La columna es "+columna); break;
				case'e': System.out.println("La columna es "+columna); break;
				case'E': System.out.println("La columna es "+columna); break;
				case'f': System.out.println("La columna es "+columna); break;
				case'F': System.out.println("La columna es "+columna); break;
				case'g': System.out.println("La columna es "+columna); break;
				case'G': System.out.println("La columna es "+columna); break;
				case'h': System.out.println("La columna es "+columna); break;
				case'H': System.out.println("La columna es "+columna); break;
				default: System.out.println("Error, sólo puede indicar una letra de la 'a' la 'h' ");
				break;
		
				}
			}
		
			catch(IllegalArgumentException e) {
				
				System.out.println("Error, sólo puede indicar una letra de la 'a' la 'h' " + e);
			}
	}
	
	/* COPIA DE MÉTODO CONSTRUCTOR PRINCIPAL O CONSTRUCTOR SECUNDARIO, en nuestro y para diferenciarlo
	* del constructor principal lo hemos creado con el asistente de Eclipse*/
	
	public Posicion(Posicion Posicion) {
		
	}
	
	// MÉTODO SETTER DE FILAS
	
	public void setFila() { 
		
		/* Establecemos un bucle do-while para que, en caso de que el usuario introduzca algún 
		 * número fuera del rango del 1 al 8, ambos incluidos, muestre la excepción contenida en 
		 * el cuerpo "catch" y se siga ejecutando el cuerpo "try" mientras que la variable de clase 
		 * de tipo int fila sea menor de 1 ó mayor que 8. De esta manera, aunque el usuario 
		 * introduzca un valor no válido y se asigne al atributo de la clase, al tener que repetir
		 * el bucle mientras que la condición falsa se cumpla forzará a que el atributo de clase
		 * finalmente adopte un valor valido del 1 al 8 ambos incluidos. */
		
		do {
			
		// En el cuerpo "try" indicamos lo que queremos que se ejecute de este método
			
		try { 
			
			System.out.println("Escriba un número del 1 al 8 para indicar la fila: ");	
			this.fila=Entrada.entero();
					
			/* En el cuerpo "catch" indicamos al programa que genere una excepción usando la 
			 * clase de Java IllegalArgumentException y creando el objeto de esa clase "e" si 
			 * el usuario no introduce un valor entero del 1 al 8, ambos inclusive */
			
		} catch (IllegalArgumentException e){ 
			
			System.out.println("Error, sólo puede indicar un número del 1 al 8 " + e);
		
		}
		
		} while (fila<1 || fila >8);
	}
	
	/* MÉTODO GETTER DE FILAS, indicamos que nos devuelva un String y concatenamos la cadena de 
	 * caracteres que hemos puesto con el atributo fila establecido antes con el método Setter*/
	
	public String getFila() { 
		
		return "La fila que se ha introducido es: " + fila;
		
	}
	
	// MÉTODO SETTER DE COLUMNAS
	
	public void setColumna() { 
		
		/* En el caso de escoger entre caracteres estableceremos un bucle de tipo Switch con las
		 * 8 letras mayúsculas y minúsculas válidas de la 'a' a la 'h' ambas inclusive. */
		
		System.out.println("Escriba una letra de la 'a' a la 'h' para indicar la columna: ");
		char vocal;
		vocal=Entrada.caracter();
		this.columna=vocal; 
		
		// En el cuerpo "try" indicamos lo que queremos que se ejecute de este método
		
		try {
			
			switch (columna){
			
				case'a': System.out.println("La columna es "+columna); break;
				case'A': System.out.println("La columna es "+columna); break;
				case'b': System.out.println("La columna es "+columna); break;
				case'B': System.out.println("La columna es "+columna); break;
				case'c': System.out.println("La columna es "+columna); break;
				case'C': System.out.println("La columna es "+columna); break;
				case'd': System.out.println("La columna es "+columna); break;
				case'D': System.out.println("La columna es "+columna); break;
				case'e': System.out.println("La columna es "+columna); break;
				case'E': System.out.println("La columna es "+columna); break;
				case'f': System.out.println("La columna es "+columna); break;
				case'F': System.out.println("La columna es "+columna); break;
				case'g': System.out.println("La columna es "+columna); break;
				case'G': System.out.println("La columna es "+columna); break;
				case'h': System.out.println("La columna es "+columna); break;
				case'H': System.out.println("La columna es "+columna); break;
				default: System.out.println("Error, sólo puede indicar una letra de la 'a' la 'h' ");
				break;
		
				}
			}
		
			/* En el cuerpo "catch" indicamos al programa que genere una excepción usando la 
			 * clase de Java IllegalArgumentException y creando el objeto de esa clase "e" si 
			 * el usuario no introduce un caracter de la 'a' a la 'h' mayúsculas o minúsculas,
			 * ambos inclusive */
		
			catch(IllegalArgumentException e) {
				System.out.println("Error, sólo puede indicar una letra de la 'a' la 'h' " + e);
			}
	}
	
	/* MÉTODO GETTER DE COLUMNAS, indicamos que nos devuelva un String y concatenamos la cadena de 
	 * caracteres que hemos puesto con el atributo columna establecido antes con el método Setter*/
	
	public String getColumna() { 
		
		return "La columna que se ha introducido es: " + columna;
		
	}
	
	// MÉTODO equals - Nos sirve para comparar objetos
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}
	
	// MÉTODO hashCode - Java compara el código interno de cada objeto
	
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

}
