/**
 * 
 */
package Practica3;

/**
 * @author Ra�l Guti�rrez Cecilia
 * @Asignatura DAW M0
 */
public class TrianguloRecto extends Figura {
	
	public TrianguloRecto(int a, int b) {
		super(a, b);
	}

	public int area() {
		return (x * y / 2);
	}
}

