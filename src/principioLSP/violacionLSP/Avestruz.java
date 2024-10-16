package principioLSP.violacionLSP;

/*
 * la clase Avestruz extiende la clase Ave, pero la implementación de volar 
 * lanza una excepción porque las avestruces no pueden volar. Esto viola el LSP porque si un
 * cliente espera que cualquier instancia de Ave pueda volar, usar una Avestruz causará un
 * error en tiempo de ejecución,
 * 
 */
public class Avestruz extends Ave {
	@Override
	public void volar() {
		throw new UnsupportedOperationException("Las avestruces no pueden volar");
	}
}