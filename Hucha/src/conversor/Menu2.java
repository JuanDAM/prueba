package conversor;

import java.util.Scanner;

public class Menu2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String menu = "1- Convertir a centígrados";
		menu = menu + "\n2- Convertir a Farenheit";
		menu = menu + "\n0- Salir";


		int opcion;
		double valor;
		do {
			System.out.println(menu);
			System.out.println("\nElige una opción: ");
			opcion = teclado.nextInt();

			switch (opcion){

			case 1: System.out.println("Farenheit: ");
			valor = teclado.nextDouble();
			System.out.println("\n"+ valor +" grados farenheit son " + Conversor2.getCentigrados(valor)+ " ºC");
			break;

			case 2: System.out.println("Centígrados: ");
			valor = teclado.nextDouble();
			System.out.println("\n" + valor + " grados centígrados son " + Conversor2.getFarenheit(valor) + " ºF");
			break;		
			}

		} while (opcion != 0);

		teclado.close();
	}

}
