package principioLSP.cumplimientoLSP;

//Nueva interfaz para voladores
/*
 * En lugar de poner el método volar en la clase base Ave, creamos una 
 * interfaz Volador para las aves que realmente pueden volar.
 */
public interface Volador {
	void volar();
}