package principioOCP.cumplimientoOCP;

//Producto con descuento
public class ProductoConDescuento extends Producto {
	private double porcentajeDescuento;

	public ProductoConDescuento(String nombre, double precioBase, double porcentajeDescuento) {
		super(nombre, precioBase);
		this.porcentajeDescuento = porcentajeDescuento;
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase() - (getPrecioBase() * (porcentajeDescuento / 100));
	}
}