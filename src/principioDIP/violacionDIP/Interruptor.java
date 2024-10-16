package principioDIP.violacionDIP;

/*
 * La clase Interruptor depende directamente de la clase Bombilla. Si queremos cambiar
 * la Bombilla por otro tipo de dispositivo, como una lámpara o un ventilador, tendríamos que
 * modificar el código de Interruptor, lo cual viola el DIP porque la clase de alto nivel
 * (Interruptor) depende de una clase de bajo nivel (Bombilla), en lugar de depender de
 * una abstracción.
 */

//Clase Interruptor que depende de Bombilla (violación del DIP)
public class Interruptor {
	private Bombilla bombilla;

	public Interruptor(Bombilla bombilla) {
		this.bombilla = bombilla;
	}

	public void operar() {
		bombilla.encender();
		// Más tarde: bombilla.apagar();
	}
}