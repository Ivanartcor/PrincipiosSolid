package principioSRP.cumplimientoSRP;

/*
 * caso, hemos separado las responsabilidades de generación e impresión del reporte
en diferentes clases. Report ahora solo se encarga de representar el reporte, mientras que
ReportGenerator y ReportPrinter manejan la generación y la impresión
respectivamente. Esto sigue el SRP porque cada clase tiene una única responsabilidad.
 * 
 */
public class Report {
	private String title;
	private String body;
	public Report(String title, String body) {
	this.title = title;
	this.body = body;
	}
	public String getTitle() {
	return title;
	}
	public String getBody() {
		return body;
	}
}

