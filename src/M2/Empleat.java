package M2;

import java.util.Arrays;

public class Empleat {
	protected String tipus;
	protected double sou;
	protected final String[] TIPUS = { "Manager", "Boss", "Employee", "Volunteer" };

	public Empleat(String tipus, double sou) {
		this.tipus = tipus;
		this.sou = sou;
	}

	public double getSou() {
		return sou;
	}

	public void setSou(double sou) {
		this.sou = sou;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public double calcular() {
		if (this.tipus.equals(TIPUS[0])) {
			return this.sou * 1.10;
		} else if (this.tipus.equals(TIPUS[1])) {
			return this.sou * 1.50;
		} else if (this.tipus.equals(TIPUS[2])) {
			return this.sou * 0.85;
		} else if (this.tipus.equals(TIPUS[3])) {
			return this.sou;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Empleat:------------- \n" +
				"Tipus: " + tipus + "\n";
	}

	
	
}
