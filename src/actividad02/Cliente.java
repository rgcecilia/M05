package actividad02;

/**
 * Refactorizacion de Cliente.java
 * Patron: Encapsular Atributo
 * Se utiliza cuando tenemos un atributo publico, convertimos el atributo privado 
 * Creamos metodos de acceso (Getters)
 * Creamos un constructor que crea el objeto recibiendo todos los atributos
 * @author Raúl Gutiérrez Cecilia
 * @Asignatura DAW M05
 */
public class Cliente {
	
	private String nombre;
	private int edad;
	private String dni;

	public Cliente() {
		
	}
	
	public Cliente(String nombre, int edad, String dni) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public static void main(String[] args) {
		
		Cliente Micliente = new Cliente("roberto",38,"12345678T");
	}
	
}
