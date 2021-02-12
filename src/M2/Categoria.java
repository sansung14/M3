package M2;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Categoria extends Empleat {

	private final String[] CATEGORIA = { "junior", "mid", "senior" };
	private boolean ajut;
	private String categoria;
	private final double bonus = 0.10;
	private boolean extra = false;

	public Categoria(String tipus, double sou, String categoria) {
		super(tipus, sou);
		this.categoria = categoria;
		this.ajut = false;

	}

	public Categoria(String tipus, double sou, String categoria, boolean ajut) {
		super(tipus, sou);
		this.categoria = categoria;
		this.ajut = ajut;
	}

	public boolean isAjut() {
		return ajut;
	}

	public void setAjut(boolean ajut) {
		this.ajut = ajut;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	// Calcula el sueldo mensual
	public double calcular() {
		if (this.tipus.equals(TIPUS[3])) {
			return super.calcular();
		} else {

			if (this.categoria.equals(CATEGORIA[0])) {
				return super.calcular() * 0.85;

			} else if (this.categoria.equals(CATEGORIA[1])) {
				return super.calcular() * 0.90;

			} else if (this.categoria.equals(CATEGORIA[2])) {
				return super.calcular() * 0.95;

			}
		}
		return 0;

	}

	// Calcula el IRPF mensual

	public double IRPF() {
		if (this.tipus.equals(TIPUS[3])) {
			return calcular();
		} else if (this.tipus.equals(TIPUS[0])) {
			return calcular() * 0.74;

		} else if (this.tipus.equals(TIPUS[1])) {
			return calcular() * 0.68;

		} else if (this.categoria.equals(CATEGORIA[2])) {
			return calcular() * 0.76;

		} else if (this.categoria.equals(CATEGORIA[1])) {
			return calcular() * 0.85;

		} else if (this.categoria.equals(CATEGORIA[0])) {
			return calcular() * 0.98;

		}
		return 0;
	}

	// Validar Categoria
	public boolean validarCategoria() {
		if (this.categoria.equalsIgnoreCase(CATEGORIA[0]) || this.categoria.equalsIgnoreCase(CATEGORIA[1])
				|| this.categoria.equalsIgnoreCase(CATEGORIA[2])) {
			return true;
		}
		return false;
	}

	// Validar Sueldo
	public boolean validacioSou() {
		if (this.tipus.equals(TIPUS[1])) {
			if (this.sou > 8000) {
				return true;
			} else {
				return false;
			}
		} else if (this.tipus.equals(TIPUS[0])) {
			if (this.sou > 3000 && this.sou < 5000) {
				return true;
			} else {
				return false;
			}
		} else if (this.ajut == false) {
			if (this.tipus.equals(TIPUS[3])) {
				if (this.sou == 0) {
					return true;
				} else {
					return false;
				}
			}
		} else if (this.ajut) {
			if (this.tipus.equals(TIPUS[3])) {
				if (this.sou < 300) {
					return true;
				} else {
					return false;
				}
			}
		} else if (this.categoria.equals(CATEGORIA[2])) {
			if (this.sou > 2700 && this.sou < 4000) {
				return true;
			} else {
				return false;
			}
		} else if (this.categoria.equals(CATEGORIA[1])) {
			if (this.sou > 1800 && this.sou < 2500) {
				return true;
			} else {
				return false;
			}
		} else if (this.categoria.equals(CATEGORIA[0])) {
			if (this.sou > 900 && this.sou < 1600) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// Calcula el suel anual
	public double anual() {
		return calcular() * 12;
	}

	// Calcula el IRPF anual

	public double anualIRPF() {
		return IRPF() * 12;
	}

	// Calcula el bonus del sueldo anual con irpf
	public double bonus() {
		extra = true;
		return anualIRPF() * 0.10;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");

		String lista = super.toString() + "Categoria: " + categoria + "\n" + "Sou brut M: " + df.format(calcular())
				+ "  €\n" + "Sou net M: " + df.format(IRPF()) + "  €\n" + "Sou brut A: " + df.format(anual()) + " €\n"
				+ "Sou net A: " + df.format(anualIRPF()) + "  €\n";
		if (super.tipus.equals(TIPUS[3])) {
			lista += "Ajut: " + ajut + "\n";
		}
		if (!super.tipus.equals(TIPUS[3])) {
			if (extra) {
				lista += "Bonus: " + df.format(bonus()) + " €\n";
			}
		}

		return lista;
	}

}
