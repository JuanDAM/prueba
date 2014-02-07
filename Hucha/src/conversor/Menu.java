package conversor;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String menu = "1- Establecer grados";
		menu = menu + "\n2- Convertir a centígrados";
		menu = menu + "\n3- Convertir a Farenheit";
		menu = menu + "\n0- Salir";

		Conversor g = new Conversor(0);

		int opcion;

		do {
			System.out.println(menu);
			System.out.println(g.getGrados() + " grados");
			System.out.println("\nElige una opción: ");
			opcion = teclado.nextInt();

			switch(opcion){

			case 1: System.out.println("Grados: ");
			double valor = teclado.nextDouble();
			g.setGrados(valor);
			break;

			case 2: System.out.println("Son " + g.getCentigrados()+ " grados ºC");
			break;

			case 3: System.out.println("Son " + g.getFarenheit()+ " grados ºF");
			break;
			}

		}while(opcion != 0);

		teclado.close();

	}

}
