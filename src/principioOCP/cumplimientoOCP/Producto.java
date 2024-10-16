package principioOCP.cumplimientoOCP;

//Clases abiertas a la extensión pero cerradas a la modificación
/*
 * 
 * Clase producto. En lugar de modificar esta clase en el futuro, podemos extender
 * su funcionalidad a través de la herencia.
 */

public class Producto {
	private String nombre;
	private double precioBase;

	public Producto(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	public double calcularPrecio() {
		return precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

}