package contador;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Contador[] vec = new Contador[3];
		for (int i=0; i<vec.length; i++) 
			vec[i] = new Contador();


		Scanner teclado = new Scanner(System.in);
		String menu = "1- Incrementar contador";
		menu = menu + "\n2- Decrementar contador";
		menu = menu + "\n3- Resetear contador";
		menu = menu + "\n4- Seleccionar contador";
		menu = menu + "\n0- Salir";


		Contador calc = vec[0];

		int opcion;

		do {
			System.out.println(menu);
			vec[0].printContador();
			vec[1].printContador();
			vec[2].printContador();
			System.out.println("\n\nElija una opción: ");
			opcion = teclado.nextInt();

			switch (opcion){

			case 1: calc.incrementar();
			break;

			case 2: calc.decrementar();
			break;

			case 3: calc.reset();
			break;

			case 4: System.out.println("Contador (1-3): ");
			int r = teclado.nextInt();
			if (r < 1 || r > 3)
				System.out.println("Error en la opción elegida");
			else
				calc = vec[r-1];
			break;

			}


		}while(opcion != 0);

		teclado.close();

	}

}
