package M3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Coche> coches = new ArrayList<Coche>();
	static ArrayList<Conductor> conductores = new ArrayList<Conductor>();
	static ArrayList<Moto> motos = new ArrayList<Moto>();
	static ArrayList<Camion> camiones = new ArrayList<Camion>();
	static ArrayList<Titular> titulares = new ArrayList<Titular>();
	public static void main(String[] args) {
	
		
//		Licencia l1 = new Licencia(48026643,"Camion","11/02/2021");
//		Licencia l2 = new Licencia(48026643,"Moto","11/02/2021");
//		Licencia l3 = new Licencia(48026643,"Coche","11/02/2021");
//
//		Conductor p1 = new Conductor("David", "Lascorz", "23/03/1992", l3);
//		Conductor p2 = new Conductor("Carlos", "Martinez", "23/03/1992", l2);
//		Conductor p3 = new Conductor("Victor", "Lopera", "23/03/1992", l1);
//
//		Titular x1 = new Titular("Emma", "Garcia", "23/03/1992", l1, true, false);
//
//		
//
//		
//		conductores.add(p1);
//		conductores.add(p2);
//		conductores.add(p3);
//
//		titulares.add(x1);
//
//		
//		Coche t1 = new Coche("1234AA", "Ford", "Azul",conductores,x1, 0.6, 3.2, "Dunlop","Dunlop");
//		Coche t2 = new Coche("1444AA", "Ferrari", "Rojo",conductores,x1, 3.5, 1.5, "Michelin","Brigeston");
//		Coche t3 = new Coche("9434AA", "Nissan", "Blanco",conductores,x1, 2.0, 3.0, "Michelin","Michelin");
//		
//		coches.add(t1);
//		coches.add(t2);
//		coches.add(t3);
		
	int option1=0;
	while(option1!=3) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("#################");
		System.out.println("1. Vehiculos");
		System.out.println("2. Usuarios");
		System.out.println("3. Salir");

		System.out.println("#################");

		System.out.println("Selecciona una opción:");
		option1 = teclado.nextInt();

		switch (option1) {
		case 1:
			System.out.println("#################");
			System.out.println("1. Crear Coche");
			System.out.println("2. Crear Moto");
			System.out.println("3. Crear Camion");
			System.out.println("4. Mostrar Coches");
			System.out.println("5. Mostrar Motos");
			System.out.println("6. Mostrar Camiones");
			System.out.println("#################");
			System.out.println("Selecciona Vehiculo:");
			int option2 = teclado.nextInt();

			switch (option2) {
			case 1:
				añadirCoche();
				break;
			case 2:
				añadirMoto();
				break;
			case 3:
				añadirCamion();
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
			System.out.println("1. Mostrar Conductores");
			System.out.println("2. Mostrar Titulares");
			System.out.println("#################");
			System.out.println("Selecciona una opcion:");
			int option3 = teclado.nextInt();
			switch (option3) {
			case 1:
				System.out.println("#################");
				for(int i=0;i<conductores.size();i++) {
					System.out.println(conductores.get(i).toString());
				}
				break;
			case 2:
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

	private static void añadirCoche() {
		Scanner teclado = new Scanner(System.in);
		Titular x1 = añadirTitular();
		String matricula3="";
		double diametro_delantero3 = 0;
		double diametro_trasero3 = 0;
		if(x1.getLicencias().getTipo_licencia().equalsIgnoreCase("moto")) {
			boolean correcto = true;
			while(correcto) {
				System.out.println("Introduce la Matricula?");
				matricula3 = teclado.next();
				if(comprobarMatricula(matricula3)) {
					correcto = false;
				}else{
					System.out.println("mal");
				};
			}
			correcto=true;
			System.out.println("Introduce la marca?");
			String marca3 = teclado.next();
			System.out.println("Introduce el color del coche?");
			String color3 = teclado.next();
			while(correcto) {
				System.out.println("Introduce el diametro de las ruedas delanteras?");
				diametro_delantero3 = teclado.nextDouble();
				System.out.println("Introduce el diametro de las ruedas traseras?");
				diametro_trasero3 = teclado.nextDouble();
				if(comprobarDiametro(diametro_delantero3, diametro_trasero3)) {
					correcto = false;
				}else{
					System.out.println("mal");
				};
			}
			System.out.println("Introduce la marca de las ruedas delantera?");
			String marca_delantero3 = teclado.next();
			System.out.println("Introduce la marca de las ruedas trasera?");
			String marca_trasera3 = teclado.next();
			System.out.println("#################");
			System.out.println("Quires añadir Conductores? SI/NO");
			String option = teclado.next();
			if(option.equalsIgnoreCase("SI")) {
				System.out.println("Cuantos conductores vas añadir?");
				int cantidad = teclado.nextInt();
				ArrayList<Conductor> c2 = new ArrayList<>();
				for(int i=0;i<cantidad;i++) {
					Conductor c1=añadirConductor();
					if(c1.getLicencia().getTipo_licencia().equalsIgnoreCase("coche")) {
						conductores.add(c1);
						c2.add(c1);
					}else {
						System.out.println("¡¡¡La licencia no era correcta no se añadira!!!");
					}
				}
				Coche c3 = new Coche(matricula3, marca3, color3,c2,x1, diametro_delantero3, diametro_trasero3, marca_delantero3, marca_trasera3);
				titulares.add(x1);
				coches.add(c3);
			}else{
				Coche c3 = new Coche(matricula3, marca3, color3,x1, diametro_delantero3, diametro_trasero3, marca_delantero3, marca_trasera3);
				titulares.add(x1);
				coches.add(c3);
				
			}
		}else {
			System.out.println("No puedes crear un Vehiculo 'Coche' con la licencia de "+x1.getLicencias().getTipo_licencia());

		}
		
	}

	private static void añadirMoto() {
		Scanner teclado = new Scanner(System.in);
		Titular x1 = añadirTitular();
		String matricula3="";
		double diametro_delantero3 = 0;
		double diametro_trasero3 = 0;
		if(x1.getLicencias().getTipo_licencia().equalsIgnoreCase("moto")) {
			boolean correcto = true;
			while(correcto) {
				System.out.println("Introduce la Matricula?");
				matricula3 = teclado.next();
				if(comprobarMatricula(matricula3)) {
					correcto = false;
				}else{
					System.out.println("mal");
				};
			}
			correcto=true;
			System.out.println("Introduce la marca?");
			String marca3 = teclado.next();
			System.out.println("Introduce el color del coche?");
			String color3 = teclado.next();
			while(correcto) {
				System.out.println("Introduce el diametro de las ruedas delanteras?");
				diametro_delantero3 = teclado.nextDouble();
				System.out.println("Introduce el diametro de las ruedas traseras?");
				diametro_trasero3 = teclado.nextDouble();
				if(comprobarDiametro(diametro_delantero3, diametro_trasero3)) {
					correcto = false;
				}else{
					System.out.println("mal");
				};
			}
			System.out.println("Introduce la marca de las ruedas delantera?");
			String marca_delantero3 = teclado.next();
			System.out.println("Introduce la marca de las ruedas trasera?");
			String marca_trasera3 = teclado.next();
			System.out.println("#################");
			System.out.println("Quires añadir Conductores? SI/NO");
			String option = teclado.next();
			if(option.equalsIgnoreCase("SI")) {
				System.out.println("Cuantos conductores vas añadir?");
				int cantidad = teclado.nextInt();
				ArrayList<Conductor> c2 = new ArrayList<>();
				for(int i=0;i<cantidad;i++) {
					Conductor c1=añadirConductor();
					if(c1.getLicencia().getTipo_licencia().equalsIgnoreCase("moto")) {
						conductores.add(c1);
						c2.add(c1);
					}else {
						System.out.println("¡¡¡La licencia no era correcta no se añadira!!!");
					}
				}
				Moto c3 = new Moto(matricula3, marca3, color3,c2,x1, diametro_delantero3, diametro_trasero3, marca_delantero3, marca_trasera3);
				titulares.add(x1);
				motos.add(c3);
			}else{
				Moto c3 = new Moto(matricula3, marca3, color3,x1, diametro_delantero3, diametro_trasero3, marca_delantero3, marca_trasera3);
				titulares.add(x1);
				motos.add(c3);
				
			}
			
		}else {
			System.out.println("No puedes crear un Vehiculo 'Moto' con la licencia de "+x1.getLicencias().getTipo_licencia());

		}
		

		
	}



	private static void añadirCamion() {
		Scanner teclado = new Scanner(System.in);
		Titular x1 = añadirTitular();
		String matricula3="";
		double diametro_delantero3 = 0;
		double diametro_trasero3 = 0;
		if(x1.getLicencias().getTipo_licencia().equalsIgnoreCase("moto")) {
			boolean correcto = true;
			while(correcto) {
				System.out.println("Introduce la Matricula?");
				matricula3 = teclado.next();
				if(comprobarMatricula(matricula3)) {
					correcto = false;
				}else{
					System.out.println("mal");
				};
			}
			correcto=true;
			System.out.println("Introduce la marca?");
			String marca3 = teclado.next();
			System.out.println("Introduce el color del coche?");
			String color3 = teclado.next();
			while(correcto) {
				System.out.println("Introduce el diametro de las ruedas delanteras?");
				diametro_delantero3 = teclado.nextDouble();
				System.out.println("Introduce el diametro de las ruedas traseras?");
				diametro_trasero3 = teclado.nextDouble();
				if(comprobarDiametro(diametro_delantero3, diametro_trasero3)) {
					correcto = false;
				}else{
					System.out.println("mal");
				};
			}
			System.out.println("Introduce la marca de las ruedas delantera?");
			String marca_delantero3 = teclado.next();
			System.out.println("Introduce la marca de las ruedas trasera?");
			String marca_trasera3 = teclado.next();
			System.out.println("#################");
			System.out.println("Quires añadir Conductores? SI/NO");
			String option = teclado.next();
			if(option.equalsIgnoreCase("SI")) {
				System.out.println("Cuantos conductores vas añadir?");
				int cantidad = teclado.nextInt();
				ArrayList<Conductor> c2 = new ArrayList<>();
				for(int i=0;i<cantidad;i++) {
					Conductor c1=añadirConductor();
					if(c1.getLicencia().getTipo_licencia().equalsIgnoreCase("camion")) {
						conductores.add(c1);
						c2.add(c1);
					}else {
						System.out.println("¡¡¡La licencia no era correcta no se añadira!!!");
					}
				}
				Camion c3 = new Camion(matricula3, marca3, color3,c2,x1, diametro_delantero3, diametro_trasero3, marca_delantero3, marca_trasera3);
				titulares.add(x1);
				camiones.add(c3);
			}else{
				Camion c3 = new Camion(matricula3, marca3, color3,x1, diametro_delantero3, diametro_trasero3, marca_delantero3, marca_trasera3);
				titulares.add(x1);
				camiones.add(c3);
				
			}
			
		}else {
			System.out.println("No puedes crear un Vehiculo 'Camion' con la licencia de "+x1.getLicencias().getTipo_licencia());

		}

		
	}

	private static Titular añadirTitular() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("#################");

		System.out.println("Introduce el nombre:");
		String nombre = teclado.next();
		System.out.println("Introduce los apellidos:");
		String apellidos = teclado.next();
		System.out.println("Introduce la fecha de nacimiento:");
		String fecha = teclado.next();
		System.out.println("Tiene seguro?");
		boolean seguro = teclado.nextBoolean();
		System.out.println("Tiene garage?");
		boolean garage = teclado.nextBoolean();
		System.out.println("Introduce la id de la licencia:");
		int id = teclado.nextInt();
		System.out.println("Introduce el tipo de licencia:");
		String tipo = teclado.next();
		System.out.println("Introduce la caducidad de la licencia:");
		String caduca = teclado.next();
		
		
		Licencia y1 = new Licencia(id,tipo,caduca);
		Titular c4 = new Titular(nombre, apellidos, fecha, y1, seguro, garage);
		return c4;
		
	}
	
	private static Conductor añadirConductor() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("#################");

		System.out.println("Introduce el nombre:");
		String nombre = teclado.next();
		System.out.println("Introduce los apellidos:");
		String apellidos = teclado.next();
		System.out.println("Introduce la fecha de nacimiento:");
		String fecha = teclado.next();
		System.out.println("Introduce la id de la licencia:");
		int id = teclado.nextInt();
		System.out.println("Introduce el tipo de licencia:");
		String tipo = teclado.next();
		System.out.println("Introduce la caducidad de la licencia:");
		String caduca = teclado.next();
		
		
		Licencia y1 = new Licencia(id,tipo,caduca);
		
		Conductor c4 = new Conductor(nombre, apellidos, fecha, y1);
		return c4;
	}

	private static boolean comprobarMatricula(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.length() < 7) {
				a = a + " ";
			}
		}
		if (a.length() == 7) {
			for (int i = 0; i < 4; i++) {
				if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				} else {
					return false;
				}
			}
			for (int i = 4; i < 6; i++) {
				if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				} else {
					return false;
				}
			}
			if (a.charAt(6) >= 'A' && a.charAt(6) <= 'Z' || a.charAt(6) == ' ') {
				return true;
			}
		}
		return false;
		
	}
	
	private static boolean comprobarDiametro(double x, double y) {
		if((x>0.4 && x<4.0) && (y>0.4 && y<4.0)) {
			return true;
		}
		return false;
	}
}
