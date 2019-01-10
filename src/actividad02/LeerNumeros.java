package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Refactorizacion de LeerNumeros.java
 * Patron: Extraer Metodos (He decidido extraer dos metodos)
 * muestraSuma: nos permitira mostrar por consola el resultado de una suma
 * pedirEntero: nos permite pedir un entero al usuario
 * los nombres explican el proposito de los metodos, el codigo queda mejor agrupado
 * @author Raúl Gutiérrez Cecilia
 * @Asignatura DAW M05
 */
public class LeerNumeros {
	
	public static void main(String[] args) throws IOException{
		int num1 = pedirEntero();
		int num2 = pedirEntero();
		muestraSuma(num1, num2);		
	}
	
	
	/** Funcion para mostrar el resultado de sumar dos numeros enteros por consola
	 * @param num1 numero entero 
	 * @param num2 numero entero
	 */
	public static void muestraSuma(int num1, int num2) {
		System.out.println("La suma de "+num1+" y "+num2+" es "+(num1 + num2));	
	}
	
	/** funcion para pedir por consola un numero entero al usuario
	 * @return un numero entero introducido por el usuario
	 * @throws IOException
	 */
	public static int pedirEntero() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe un numero entero:");
		return Integer.valueOf(br.readLine());
	}
}
