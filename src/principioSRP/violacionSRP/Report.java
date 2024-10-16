package principioSRP.violacionSRP;

/*
 * la clase Report tiene dos responsabilidades: generar y imprimir reportes.
 * Esto viola el SRP porque si necesitamos cambiar la forma en que se generan o imprimen
 * los reportes, tendríamos que modificar la misma clase
 */

public class Report {
	private String title;
	private String body;

	public Report(String title, String body) {
		this.title = title;
		this.body = body;
	}

	public void generateReport() {
// Genera el reporte en un formato específico
		System.out.println("Generating report...");
	}

	public void printReport() {
// Imprime el reporte
		System.out.println("Printing report: " + title + body);
	}
}