package M3;

public class Conductor extends Personas{
	protected Licencia licencia;

	public Conductor(String nombre, String apellidos, String data_naixement) {
		super(nombre, apellidos, data_naixement);
		this.licencia = licencia;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Licencia: "+licencia+"\n";
	}
}
