package principioOCP.cumplimientoOCP;

//Producto con impuesto
public class ProductoConImpuesto extends Producto {
	private double porcentajeImpuesto;

	public ProductoConImpuesto(String nombre, double precioBase, double porcentajeImpuesto) {
		super(nombre, precioBase);
		this.porcentajeImpuesto = porcentajeImpuesto;
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase() + (getPrecioBase() * (porcentajeImpuesto / 100));
	}
}