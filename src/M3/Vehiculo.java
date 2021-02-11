package M3;

import java.util.ArrayList;

public class Vehiculo {
	protected String matricula;
	protected String marca;
	protected String color;
	protected Titular titular;
	protected ArrayList<Conductor> conductor;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean matriculaCorrecta() {
		for (int i = 0; i < this.matricula.length(); i++) {
			if (this.matricula.length() < 7) {
				this.matricula = matricula + " ";
			}
		}
		if (this.matricula.length() == 7) {
			for (int i = 0; i < 4; i++) {
				if (matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9') {
				} else {
					return false;
				}
			}
			for (int i = 4; i < 6; i++) {
				if (matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z') {
				} else {
					return false;
				}
			}
			if (matricula.charAt(6) >= 'A' && matricula.charAt(6) <= 'Z' || matricula.charAt(6) == ' ') {
				return true;
			}
		}
		return false;

	}

	public Vehiculo(String matricula, String marca, String color, ArrayList<Conductor> conductor, Titular titular) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.titular = titular;
		this.conductor = conductor;
	}



	public String toString() {
		String lista = "Coche:" + "\n" + "Matricula: " + matricula + "\n" + "Marca vehiculo: " + marca + "\n" + "Color: "
				+ color + "\n" + "Titular: " + titular.nombre + " " + titular.apellidos + "\n" + 	"Conductores: \n";
		lista+="-----------------\n";
		for(int i=0;i<conductor.size();i++) {
			lista+=conductor.get(i).getNombre() + " " +conductor.get(i).apellidos +"\n";
		}
		lista+="-----------------\n";


		return lista;
				
	}

}
