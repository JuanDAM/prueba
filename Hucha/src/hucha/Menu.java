package hucha;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);		
		String menu = "1- Consultar Saldo";
		menu = menu + "\n2- Ingresar";
		menu = menu + "\n3- Retirar";
		menu = menu + "\n4- Salir";
		
		Hucha cerdito = new Hucha();
		
		int opcion;

		do {

			System.out.println(menu);

			System.out.println("\nElija una opción: ");
			opcion = teclado.nextInt();

			switch (opcion){

			case 1: System.out.println("\n" + cerdito);
					break;
			
			case 2: System.out.print("Cantidad que desea ingresar: ");
					double valor = teclado.nextDouble();
					int error = cerdito.setIngresar(valor);			
					if (error == -1)
						System.out.println("Error al ingresar");
					break;
					
			case 3: System.out.print("Cantidad que desea retirar: ");
					double valor2 = teclado.nextDouble();
					int error2 = cerdito.setIngresar(valor2);
					if (error2 == -1)
						System.out.println("Error al retirar");
					break;
		
					
			}

		} while(opcion != 4);
		
		teclado.close();

	}

}
