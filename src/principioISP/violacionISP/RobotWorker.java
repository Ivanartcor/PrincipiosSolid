package principioISP.violacionISP;

/*
 * Esto viola el ISP porque RobotWorker está obligado a implementar
 * métodos que no utiliza.
 */

public class RobotWorker implements Worker {
	@Override
	public void work() {
		System.out.println("Working...");
	}

	@Override
	public void eat() {
		throw new UnsupportedOperationException("Robots don't eat");
	}
}