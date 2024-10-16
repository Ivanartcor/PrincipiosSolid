package principioDIP.cumplimientoDIP;

//Clase Interruptor que ahora depende de la abstracción (cumple con el DIP)
public class Interruptor {
	private Encendible dispositivo;

	public Interruptor(Encendible dispositivo) {
		this.dispositivo = dispositivo;
	}

	public void operar() {
		dispositivo.encender();
//Más tarde: dispositivo.apagar();
	}
}