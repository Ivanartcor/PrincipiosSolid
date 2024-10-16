package principioOCP;

import principioOCP.cumplimientoOCP.Producto;
import principioOCP.cumplimientoOCP.ProductoConDescuento;
import principioOCP.cumplimientoOCP.ProductoConImpuesto;

public class Main {
	public static void main(String[] args) {
		Producto producto = new Producto("Laptop", 1000);
		ProductoConDescuento productoConDescuento = new ProductoConDescuento("Smartphone", 500, 10);
		ProductoConImpuesto productoConImpuesto = new ProductoConImpuesto("Tablet", 300, 21);
		System.out.println("Precio del producto: " + producto.getNombre() + " es: " + producto.calcularPrecio());
		System.out.println("Precio del producto con descuento: " + productoConDescuento.getNombre() + " es: "
				+ productoConDescuento.calcularPrecio());
		System.out.println("Precio del producto con impuesto: " + productoConImpuesto.getNombre() + " es: "
				+ productoConImpuesto.calcularPrecio());
	}
}