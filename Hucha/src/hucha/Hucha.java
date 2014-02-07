package hucha;

public class Hucha {

	private double dinero;

	public Hucha(){
		dinero = 0;
	}

	public double getDinero() {
		return dinero;
	}

	public int setIngresar(double euros) {
		if (euros < 0)
			return -1;
		else {
			dinero = dinero + euros;
			return 0;
		}

	}

	public int setRetirar(double euros) {
		if (euros < 0 || euros > dinero)
		return -1;
		else {
			dinero = dinero - euros;
			return 0;
		}
	}

	public String toString() {
		return "Hay " + dinero + " euros.";
	}

}
