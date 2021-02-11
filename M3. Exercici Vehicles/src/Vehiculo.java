import java.util.Iterator;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Vehiculo {
	protected String matricula;
	protected String marca;
	protected String color;
	/**
	 * @param matricula
	 * @param marca
	 * @param color
	 */
	public Vehiculo(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean matriculaCorrecta(Object a) {
		boolean esCorrecto = true;
		for (int i = 0; i < 4; i++) {
			if(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9') {
			} else {
				return false;
			}
		}
		for (int i = 0; i < 3; i++) {
			if(matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z') {
			} else {
				return false;
			}
		}
		return true;
	}
}
