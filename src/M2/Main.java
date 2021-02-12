package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		ArrayList<Categoria> empleados = new ArrayList<Categoria>();

		Categoria c1 = new Categoria("Manager", 3500, "junior");
		Categoria c2 = new Categoria("Boss", 9000, "senior");
		Categoria c3 = new Categoria("Employee", 1600, "mid");

		empleados.add(c1);
		empleados.add(c2);
		empleados.add(c3);

		Categoria c;
		int option = 0;
		boolean correctoTipo = false;
		boolean correctoCat = false;
		// MENU
		while (option != 4) {
			boolean x = false;
			System.out.println("######################");
			System.out.println("1. Añadir Empleado:");
			System.out.println("2. Mostrar Empleados:");
			System.out.println("3. Producir bonus a la plantilla:");
			System.out.println("4. Salir:");
			System.out.println("######################");
			option = sn.nextInt();
			switch (option) {
			case 1:
				do {
					correctoTipo = false;
					correctoCat = false;
					System.out.println("Escribe el tipo de empleado:");
					String tipo = sn.next();
					System.out.println("Escribe la cantidad de sueldo mensual:");
					double sou = sn.nextDouble();
					System.out.println("Escribe la Categoria 'JUNIOR/MID/SENIOR':");
					String categoria = sn.next().toLowerCase();
					// Comprueba si es voluntario i si cobra menos de 300 euros.
					if (tipo.equals("Volunteer") && (sou > 0 && sou < 300)) {
						System.out.println("Es una ajuda?");
						boolean ajuda = sn.nextBoolean();
						c = new Categoria(tipo, sou, categoria, ajuda);
					} else {
						c = new Categoria(tipo, sou, categoria);
					}

					if (c.validacioSou() == false) {
						System.out.println("El sueldo no corresponde al tipo de empleado!\n¡¡Repite!!");
					} else {
						correctoTipo = c.validacioSou();
					}
					if (c.validarCategoria() == false) {
						System.out.println("La categoria no es correcta!\n¡¡Repite!!");
					} else {
						correctoCat = c.validarCategoria();
					}

					if (correctoTipo == true && correctoCat == true) {
						x = true;
					}

				} while (x == false);

				System.out.println("######################");
				System.out.println(c.toString());
				empleados.add(c);
				break;
			case 2:
				for (int i = 0; i < empleados.size(); i++) {
					System.out.println(empleados.get(i).toString());
				}
				break;
			case 3:
				for (int i = 0; i < empleados.size(); i++) {
					empleados.get(i).bonus();
				}
				break;
			}

		}

	}

}
