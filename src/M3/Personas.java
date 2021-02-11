package M3;

public class Personas {
	protected String nombre;
	protected String apellidos;
	protected String data_naixement;

	public Personas(String nombre, String apellidos, String data_naixement) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.data_naixement = data_naixement;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getData_naixement() {
		return data_naixement;
	}

	public void setData_naixement(String data_naixement) {
		this.data_naixement = data_naixement;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n" +
				"Apellidos: " + apellidos + "\n" +
			    "Fecha nacimientos: " + data_naixement + "\n";
	}

}
