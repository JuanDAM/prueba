package conversor;

import java.util.Scanner;

public class Menu2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String menu = "1- Convertir a cent�grados";
		menu = menu + "\n2- Convertir a Farenheit";
		menu = menu + "\n0- Salir";


		int opcion;
		double valor;
		do {
			System.out.println(menu);
			System.out.println("\nElige una opci�n: ");
			opcion = teclado.nextInt();

			switch (opcion){

			case 1: System.out.println("Farenheit: ");
			valor = teclado.nextDouble();
			System.out.println("\n"+ valor +" grados farenheit son " + Conversor2.getCentigrados(valor)+ " �C");
			break;

			case 2: System.out.println("Cent�grados: ");
			valor = teclado.nextDouble();
			System.out.println("\n" + valor + " grados cent�grados son " + Conversor2.getFarenheit(valor) + " �F");
			break;		
			}

		} while (opcion != 0);

		teclado.close();
	}

}
