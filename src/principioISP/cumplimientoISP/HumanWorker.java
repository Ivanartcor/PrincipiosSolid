package principioISP.cumplimientoISP;

public class HumanWorker implements Workable, Eatable {

	@Override
	public void eat() {
		System.out.println("Working...");

	}

	@Override
	public void work() {
		System.out.println("Eating...");
	}

}
