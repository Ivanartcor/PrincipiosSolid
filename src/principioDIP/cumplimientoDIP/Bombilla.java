package principioDIP.cumplimientoDIP;

//Implementación de la interfaz Encendible para una bombilla
public class Bombilla implements Encendible {
	@Override
	public void encender() {
		System.out.println("La bombilla está encendida");
	}

	@Override
	public void apagar() {
		System.out.println("La bombilla está apagada");
	}
}