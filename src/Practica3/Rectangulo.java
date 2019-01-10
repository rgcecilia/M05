/**
 * 
 */
package Practica3;

/**
 * @author Raúl Gutiérrez Cecilia
 * @Asignatura DAW M0
 */
public class Rectangulo extends Figura {
	public Rectangulo(int a, int b) {
		super(a, b);
	}

	public int area() {
		return (x * y);
	}
}

