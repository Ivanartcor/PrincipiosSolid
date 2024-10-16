package principioLSP.cumplimientoLSP;

//Clase Avestruz, que no implementa Volador porque no vuela
/*
 * Avestruz hereda de Ave, pero no está forzada a implementar el método volar.
 */
public class Avestruz extends Ave {
	public Avestruz(String nombre) {
		super(nombre);
	}
}