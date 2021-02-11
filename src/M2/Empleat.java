package M2;

public class Empleat {
	private String categoria;
	private String sou;
	
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getSou() {
		return sou;
	}
	
	public void setSou(String sou) {
		this.sou = sou;
	}
	
	
	public Empleat(String categoria, String sou) {
		super();
		this.categoria = categoria;
		this.sou = sou;
	}
	
	
}
