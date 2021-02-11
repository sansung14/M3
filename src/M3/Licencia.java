package M3;

public class Licencia {
	private int id;
	private String tipo_licencia;
	private String data_caducidad;

	public Licencia(String nombre, String apellidos, String data_naixement, int id,
			String tipo_licencia, String data_caducidad) {
		super();
		this.id = id;
		this.tipo_licencia = tipo_licencia;
		this.data_caducidad = data_caducidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo_licencia() {
		return tipo_licencia;
	}

	public void setTipo_licencia(String tipo_licencia) {
		this.tipo_licencia = tipo_licencia;
	}

	public String getData_caducidad() {
		return data_caducidad;
	}

	public void setData_caducidad(String data_caducidad) {
		this.data_caducidad = data_caducidad;
	}


	@Override
	public String toString() {
		return super.toString()+"ID: "+ id +"\n"+
								"Tipo de licencia: "+ tipo_licencia +"\n"+
								"Data caducidad: "+ data_caducidad +"\n";
	}

}
