package M3;

public class Titular extends Personas{
	protected Licencia licencia;
	protected boolean asseguranša;
	protected boolean garatge;
	

	public boolean isAsseguranša() {
		return asseguranša;
	}
	public void setAsseguranša(boolean asseguranša) {
		this.asseguranša = asseguranša;
	}
	public boolean isGaratge() {
		return garatge;
	}
	public void setGaratge(boolean garatge) {
		this.garatge = garatge;
	}
	
	public Titular(String nombre, String apellidos, String data_naixement, boolean asseguranša,
			boolean garatge) {
		super(nombre, apellidos, data_naixement);
		this.asseguranša = asseguranša;
		this.garatge = garatge;
	}
	
	


}
