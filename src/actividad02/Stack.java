package actividad02;
import java.util.Vector;

/**
 * Clase para guardar datos de tipo entero en un vector de nombre elementos
 * Sabemos siempre cual es el ultimo elemento por la propiedad tama�o del vector
 * @author Ra�l Guti�rrez Cecilia
 * @Asignatura DAW M05
 */
public class Stack {
	
	private int tama�o; // numero de elementos que tiene el vector
	private Vector<Integer> elementos; // Guarda los datos dentro de un vector
	
	/**
	 * Constructor por defecto de la clase Stack 
	 * Instancia el vector e inicializa el tama�o a 0
	 */
	public Stack() {
		
		elementos = new Vector<Integer>();
		tama�o = 0;
	}
	/**
	 * Si el vector esta vacio devuelve false, y true en caso contrario
	 * @return boolean
	 */
	public boolean stackVacio () {
		if (tama�o==0) {
			return true;
		}
		return false;
	}
	/**
	 * Recibe un entero y lo a�ade al Stack
	 * @param o Integer
	 */
	public void apilar ( Integer o ) {
		elementos.add(tama�o, o);
		tama�o++;
	}
	/**
	 * Reduce el tama�o del vector en 1, desapilando su ultimo elemento
	 * Si el vector esta vacio, devuelve una excepcion
	 * Si contiene elementos, devuelve el elemento desapilado
	 * @return Integer
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tama�o);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack esta vacio");
			return null;
		}
	}
	/**
	 * Devuelve el tama�o del vector
	 * @return int
	 */
	public int getNumElements() {
		return tama�o;
	}

	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}
}
