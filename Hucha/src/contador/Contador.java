package contador;

public class Contador {
	
	private int numero;
	
	public Contador() {
		numero = 0;
	}

	public void incrementar() {
		numero = numero + 1;
	}
	
	public void decrementar() {
		numero = numero -1;
	}
	
	public int getContador (){
		return numero;
	}
	
	public void printContador () {
		System.out.print("\n" + "Valor: " +numero );
	}
	
	public String toString() {
		return "" + numero;
		
	}
	
	public void reset() {
		numero = 0;
	}

}
