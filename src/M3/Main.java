package M3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		ArrayList<Moto> motos = new ArrayList<Moto>();
		ArrayList<Camion> camiones = new ArrayList<Camion>();
		ArrayList<Conductor> conductores = new ArrayList<Conductor>();
		ArrayList<Titular> titulares = new ArrayList<Titular>();

		
		
		Licencia l1 = new Licencia(48026643,"Camion","11/02/2021");
		Licencia l2 = new Licencia(48026643,"Moto","11/02/2021");
		Licencia l3 = new Licencia(48026643,"Coche","11/02/2021");

		Conductor p1 = new Conductor("David", "Lascorz", "23/03/1992", l3);
		Conductor p2 = new Conductor("Carlos", "Martinez", "23/03/1992", l2);
		Conductor p3 = new Conductor("Victor", "Lopera", "23/03/1992", l1);

		Titular x1 = new Titular("Emma", "Garcia", "23/03/1992", l1, true, false);

		

		
		conductores.add(p1);
		conductores.add(p2);
		conductores.add(p3);

		titulares.add(x1);

		
		Coche t1 = new Coche("1234AA", "Ford", "Azul",conductores,x1, 0.6, 3.2, "Dunlop","Dunlop");
		Coche t2 = new Coche("1444AA", "Ferrari", "Rojo",conductores,x1, 3.5, 1.5, "Michelin","Brigeston");
		Coche t3 = new Coche("9434AA", "Nissan", "Blanco",conductores,x1, 2.0, 3.0, "Michelin","Michelin");
		
		coches.add(t1);
		coches.add(t2);
		coches.add(t3);
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("#################");
		System.out.println("1. Vehiculos");
		System.out.println("2. Usuarios");
		System.out.println("#################");

		System.out.println("Selecciona una opción:");
		int option1 = teclado.nextInt();

		switch (option1) {
		case 1:
			System.out.println("#################");
			System.out.println("1. Coche");
			System.out.println("2. Moto");
			System.out.println("3. Camion");
			System.out.println("4. Mostrar Vehiculos");
			System.out.println("#################");

			System.out.println("Selecciona Vehiculo:");
			int option2 = teclado.nextInt();

			switch (option2) {
			case 1:
				System.out.println("Introduce la Matricula?");
				String matricula = teclado.next();
				System.out.println("Introduce la marca?");
				String marca = teclado.next();
				System.out.println("Introduce el color del coche?");
				String color = teclado.next();
				System.out.println("Introduce el diametro de las ruedas delanteras?");
				double diametro_delantero = teclado.nextDouble();
				System.out.println("Introduce el diametro de las ruedas traseras?");
				double diametro_trasero = teclado.nextDouble();
				System.out.println("Introduce la marca de las ruedas delantera?");
				String marca_delantero = teclado.next();
				System.out.println("Introduce la marca de las ruedas trasera?");
				String marca_trasera = teclado.next();

				Coche c1 = new Coche(matricula, marca, color,conductores,x1, diametro_delantero, diametro_trasero, marca_delantero,
						marca_trasera);

				coches.add(c1);

				System.out.print(c1);

				break;
			case 2:

				System.out.println("Introduce la Matricula?");
				String matricula2 = teclado.next();
				System.out.println("Introduce la marca?");
				String marca2 = teclado.next();
				System.out.println("Introduce el color del coche?");
				String color2 = teclado.next();
				System.out.println("Introduce el diametro de las ruedas delanteras?");
				double diametro_delantero2 = teclado.nextDouble();
				System.out.println("Introduce el diametro de las ruedas traseras?");
				double diametro_trasero2 = teclado.nextDouble();
				System.out.println("Introduce la marca de las ruedas delantera?");
				String marca_delantero2 = teclado.next();
				System.out.println("Introduce la marca de las ruedas trasera?");
				String marca_trasera2 = teclado.next();

				Moto c2 = new Moto(matricula2, marca2, color2,conductores,x1, diametro_delantero2, diametro_trasero2, marca_delantero2,
						marca_trasera2);

				motos.add(c2);

				break;
			case 3:
				System.out.println("Introduce la Matricula?");
				String matricula3 = teclado.next();
				System.out.println("Introduce la marca?");
				String marca3 = teclado.next();
				System.out.println("Introduce el color del coche?");
				String color3 = teclado.next();
				System.out.println("Introduce el diametro de las ruedas delanteras?");
				double diametro_delantero3 = teclado.nextDouble();
				System.out.println("Introduce el diametro de las ruedas traseras?");
				double diametro_trasero3 = teclado.nextDouble();
				System.out.println("Introduce la marca de las ruedas delantera?");
				String marca_delantero3 = teclado.next();
				System.out.println("Introduce la marca de las ruedas trasera?");
				String marca_trasera3 = teclado.next();

				Camion c3 = new Camion(matricula3, marca3, color3,conductores,x1, diametro_delantero3, diametro_trasero3,
						marca_delantero3, marca_trasera3);

				camiones.add(c3);
				break;
			case 4:
				System.out.println("#################");
				for(int i=0;i<coches.size();i++) {
					System.out.println(coches.get(i).toString());
				}
				break;
				
			case 5:
				System.out.println("#################");
				for(int i=0;i<motos.size();i++) {
					System.out.println(motos.get(i).toString());
				}
				break;
			case 6:
				System.out.println("#################");
				for(int i=0;i<camiones.size();i++) {
					System.out.println(camiones.get(i).toString());
				}
				break;
			}
			break;
		case 2:
			System.out.println("#################");
			System.out.println("1. Crear Titular");
			System.out.println("2. Crear Conductor");
			System.out.println("3. Mostrar Conductores");
			System.out.println("4. Mostrar Titulares");
			System.out.println("#################");
			System.out.println("Selecciona una opcion:");
			int option3 = teclado.nextInt();
			switch (option3) {
			case 1:
				System.out.println("Introduce el nombre:");
				String nombre = teclado.next();
				System.out.println("Introduce los apellidos:");
				String apellidos = teclado.next();
				System.out.println("Introduce la fecha de nacimiento:");
				String fecha = teclado.next();
				System.out.println("Introduce la marca de las ruedas delantera?");
				boolean licencia = teclado.nextBoolean();

				Conductor c4 = new Conductor(nombre, apellidos, fecha, l1);

				//conductores.add(c4);

				System.out.print(c4);
				break;
			case 2:
				System.out.println("Introduce el nombre:");
				String nombre2 = teclado.next();
				System.out.println("Introduce los apellidos:");
				String apellidos2 = teclado.next();
				System.out.println("Introduce la fecha de nacimiento:");
				String fecha2 = teclado.next();
				System.out.println("Introduce la marca de las ruedas delantera?");
				boolean licencia2 = teclado.nextBoolean();

				Conductor c5 = new Conductor(nombre2, apellidos2, fecha2 , l1);

				//conductores.add(c5);

				System.out.print(c5);
				break;
			case 3:
				System.out.println("#################");
				for(int i=0;i<conductores.size();i++) {
					System.out.println(conductores.get(i).toString());
				}
				break;
			case 4:
				System.out.println("#################");
				for(int i=0;i<titulares.size();i++) {
					System.out.println(titulares.get(i).toString());
				}
				break;
			}
		
		}

		// System.out.print(c1.matriculaCorrecta());
		// System.out.print(c1.comprobarDiametro());

	}

}
