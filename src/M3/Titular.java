package M3;

public class Titular extends Personas{
	protected Licencia licencia;
	protected boolean asseguran�a;
	protected boolean garatge;
	
	public Licencia getLicencias() {
		return licencia;
	}
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	public boolean isAsseguran�a() {
		return asseguran�a;
	}
	public void setAsseguran�a(boolean asseguran�a) {
		this.asseguran�a = asseguran�a;
	}
	public boolean isGaratge() {
		return garatge;
	}
	public void setGaratge(boolean garatge) {
		this.garatge = garatge;
	}
	
	public Titular(String nombre, String apellidos, String data_naixement, Licencia licencia, boolean asseguran�a,
			boolean garatge) {
		super(nombre, apellidos, data_naixement);
		this.licencia = licencia;
		this.asseguran�a = asseguran�a;
		this.garatge = garatge;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Licencia: "+ licencia +"\n";
	}


}
