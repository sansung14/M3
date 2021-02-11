package M3;

public class Titular extends Personas{
	protected Licencia licencia;
	protected boolean assegurança;
	protected boolean garatge;
	

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
	
	public Titular(String nombre, String apellidos, String data_naixement, boolean assegurança,
			boolean garatge) {
		super(nombre, apellidos, data_naixement);
		this.assegurança = assegurança;
		this.garatge = garatge;
	}
	
	


}
