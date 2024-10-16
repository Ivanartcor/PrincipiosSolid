package principioDIP.cumplimientoDIP;

public class Ventilador implements Encendible {
	@Override
	public void encender() {
		System.out.println("El ventilador está encendido");
	}

	@Override
	public void apagar() {
		System.out.println("El ventilador está apagada");
	}
}