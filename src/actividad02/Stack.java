package actividad02;
import java.util.Vector;

/**
 * Clase para guardar datos de tipo entero en un vector de nombre elementos
 * Sabemos siempre cual es el ultimo elemento por la propiedad tamaño del vector
 * @author Raúl Gutiérrez Cecilia
 * @Asignatura DAW M05
 */
public class Stack {
	
	private int tamaño; // numero de elementos que tiene el vector
	private Vector<Integer> elementos; // Guarda los datos dentro de un vector
	
	/**
	 * Constructor por defecto de la clase Stack 
	 * Instancia el vector e inicializa el tamaño a 0
	 */
	public Stack() {
		
		elementos = new Vector<Integer>();
		tamaño = 0;
	}
	/**
	 * Si el vector esta vacio devuelve false, y true en caso contrario
	 * @return boolean
	 */
	public boolean stackVacio () {
		if (tamaño==0) {
			return true;
		}
		return false;
	}
	/**
	 * Recibe un entero y lo añade al Stack
	 * @param o Integer
	 */
	public void apilar ( Integer o ) {
		elementos.add(tamaño, o);
		tamaño++;
	}
	/**
	 * Reduce el tamaño del vector en 1, desapilando su ultimo elemento
	 * Si el vector esta vacio, devuelve una excepcion
	 * Si contiene elementos, devuelve el elemento desapilado
	 * @return Integer
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tamaño);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack esta vacio");
			return null;
		}
	}
	/**
	 * Devuelve el tamaño del vector
	 * @return int
	 */
	public int getNumElements() {
		return tamaño;
	}

	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}
}
