package Nivell1_Ex8;

public class Persona {
	private String nombre;
	private int edad;
	private int telefono;
	
	public Persona() {}

	public Persona(String nombre, int edad, int telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
	
	
	

}
