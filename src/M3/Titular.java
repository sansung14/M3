package M3;

public class Titular extends Personas{
	protected Licencia licencia;
	protected boolean assegurança;
	protected boolean garatge;
	
	public Licencia getLicencias() {
		return licencia;
	}
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	public boolean isAssegurança() {
		return assegurança;
	}
	public void setAssegurança(boolean assegurança) {
		this.assegurança = assegurança;
	}
	public boolean isGaratge() {
		return garatge;
	}
	public void setGaratge(boolean garatge) {
		this.garatge = garatge;
	}
	
	public Titular(String nombre, String apellidos, String data_naixement, Licencia licencia, boolean assegurança,
			boolean garatge) {
		super(nombre, apellidos, data_naixement);
		this.licencia = licencia;
		this.assegurança = assegurança;
		this.garatge = garatge;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Licencia: "+ licencia +"\n";
	}


}
