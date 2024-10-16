package principioLSP.cumplimientoLSP;

//Clase Gorrion, que sí puede volar
/*
 * Gorrion hereda de Ave y sí implementa la interfaz Volador.
 */
public class Gorrion extends Ave implements Volador {
	public Gorrion(String nombre) {
		super(nombre);
	}

	@Override
	public void volar() {
		System.out.println("El gorrión está volando");
	}
}