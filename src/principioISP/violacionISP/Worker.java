package principioISP.violacionISP;

/*
 * la interfaz Worker incluye métodos que no son aplicables a todas las
 * implementaciones. Mientras que HumanWorker puede implementar ambos métodos (work
 * y eat), RobotWorker solo puede implementar el método work y no tiene sentido
 * implementar eat.
 */
public interface Worker {
	void work();
	void eat();
}
